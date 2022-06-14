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
	    

	    @ManyToOne(optional=false)
	    private Avaliacao avaliacao;
	    
	    
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

		public Avaliacao getAvaliacao() {
			return avaliacao;
		}
		public void setAvaliacao(Avaliacao avaliacao) {
			this.avaliacao = avaliacao;
		}
		public String getComentario() {
			return comentario;
		}
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
	}