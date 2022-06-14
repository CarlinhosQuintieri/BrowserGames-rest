package ps2.restapidb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avaliacoes")
public class Avaliacao {
    @Id @GeneratedValue
    private long id;
    private long estrela;


    public Avaliacao(){
        super();
    }
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

	public long getEstrela() {
		return estrela;
	}

	public void setEstrela(long estrela) {
		this.estrela = estrela;
	}




}