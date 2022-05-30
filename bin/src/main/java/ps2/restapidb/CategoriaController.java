package ps2.restapidb;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
class CategoriaController {

	@Autowired
	private CategoriaRepo CategoriaRepo;

	public CategoriaController() {

	}
	

    @GetMapping("/api/categorias")
	Iterable<Categoria> getCategorias() {
		return CategoriaRepo.findAll();
	}
    
	
	@GetMapping("/api/categorias/{id}")
	Optional<Categoria> getCategoria(@PathVariable long id) {
		return CategoriaRepo.findById(id);
	}
	
	
	@PostMapping("/api/categorias")
	Categoria createCategoria(@RequestBody Categoria c) {
		Categoria createdCategoria = CategoriaRepo.save(c);
		return createdCategoria;
	}

	
	@PutMapping("/api/categorias/{categoriaId}")
	Optional<Categoria> updateCategoria(@RequestBody Categoria categoriaRequest, @PathVariable long categoriaId) {
		Optional<Categoria> opt = this.getCategoria(categoriaId);
		if (opt.isPresent()) {
			Categoria categoria = opt.get();
			if (categoriaRequest.getId() == categoria.getId()) {
				categoria.setNomeCat(categoriaRequest.getNomeCat());
				CategoriaRepo.save(categoria);
				return opt;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Não foi pssivel alterar a categoria de ID:" + categoriaId);	
	}

	
	@DeleteMapping(value = "/api/categorias/{id}")
	void deleteCategoria(@PathVariable long id) {
		CategoriaRepo.deleteById(id);
	}	
}