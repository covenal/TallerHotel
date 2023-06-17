package edu.TdeA.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);

	}

	@GetMapping("/hello")
	public String GetSaludar() {
		return "Hola Mundo";
	}

	//Probando Intellij

	//Probando Intellij

	//Probando Intellij
}