package in.ak.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.ak.main")
public class AbdPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbdPetClinicApplication.class, args);
	}

}
