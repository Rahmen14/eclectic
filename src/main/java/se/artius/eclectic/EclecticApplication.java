package se.artius.eclectic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EclecticApplication {

	public static void main(String[] args) {
		System.out.println("Start eclectic app...");
		SpringApplication.run(EclecticApplication.class, args);
		System.out.println("... app is up and running.");
	}

}
