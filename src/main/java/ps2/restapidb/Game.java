package ps2.restapidb;

import javax.persistence.*;

	@Entity
	@Table(name="games")
	public class Game {
	    @Id @GeneratedValue
	    private long id;
	    private String nome;
	    private String url;
	    private String Descricao;
	    private String imagem;
		private String comentario;
		private String estrela;
	  
		@ManyToOne(optional=false)
	    private Categoria categoria;
	    

	    public Game(){
	        super();
	    }
	    public long getId(){
	        return id;
	    }
	    public void setId(long id){
	        this.id = id;
	    }
	    public String getNome(){
	        return nome;
	    }
	    public void setNome(String nome){
	        this.nome = nome;
	    }
	  
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		
		public String getImagem() {
			return imagem;
		}
		public void setImagem(String imagem) {
			this.imagem = imagem;
		}
		public String getDescricao() {
			return Descricao;
		}
		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
		public String getComentario() {
			return comentario;
		}
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		public String getEstrela() {
			return estrela;
		}
	
		public void setEstrela(String estrela) {
			this.estrela = estrela;
		}
		
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

	
	}