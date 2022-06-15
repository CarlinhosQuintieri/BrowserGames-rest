package ps2.restapidb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
    @Id @GeneratedValue
    private long id;
    private String categoria;


    public Categoria(){
        super();
    }
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}




}