package ps2.restapidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class _App {

	public static void main(String[] args) {
		SpringApplication.run(_App.class, args);
		Avaliacao teste = new Avaliacao();

		teste.setId(1);
		teste.setEstrela(1);
		teste.setId(2);
		teste.setEstrela(2);
		teste.setId(3);
		teste.setEstrela(3);
		teste.setId(4);
		teste.setEstrela(4);
		teste.setId(5);
		teste.setEstrela(5);

	}

}

