package com.example.proyect.librosApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.ConsumoAPI;

@SpringBootApplication
public class LibrosApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibrosApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumoApi = new ConsumoAPI();

		var json = consumoApi.obtenerDatos("http://gutendex.com/books/");
		System.out.println(json);
	}
}
