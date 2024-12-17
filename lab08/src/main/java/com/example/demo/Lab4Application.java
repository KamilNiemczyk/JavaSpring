package com.example.demo;

import com.example.demo.model.Tile;
import com.example.demo.service.TileService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab4Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab4Application.class, args);
	}

	@Bean
	CommandLineRunner appSetup(TileService tileService) {
		return args -> {
			tileService.createTile(new Tile("Tile 1", 1, 2, 3, "Glass", "Sopot"));
			tileService.createTile(new Tile("Tile 2", 2, 3, 4, "Wood", "Gdansk"));
			tileService.createTile(new Tile("Tile 3", 3, 4, 5, "Metal", "Gdynia"));
		};
	}

}
