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
    private String nomeCat;
    
    public Categoria(){
        super();
    }
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

	public String getNomeCat() {
		return nomeCat;
	}

	public void setNomeCat(String nomeCat) {
		this.nomeCat = nomeCat;
	}
}