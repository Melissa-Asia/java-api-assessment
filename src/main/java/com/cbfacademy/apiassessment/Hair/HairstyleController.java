package com.cbfacademy.apiassessment.Hair;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cbfacademy.apiassessment.Hair.HairstyleRepository;

//Acesses the endpoints to gt application - very little logic
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/Hairtyle")
public class HairstyleController {

	private final HairstyleService hairstyleService = new HairstyleService();

	/*
	 * public HairstyleController(HairstyleService hairstyleService) {
	 * this.hairstyleService = hairstyleService;
	 * }
	 */

	// Retrieve all
	@GetMapping
	public Hairstyle getAllHairstyles() throws IOException {
		return hairstyleService.getAllHairstyles();
	}

	// Find by Json key
	@GetMapping
	public Hairstyle findHairstyleByKey(String key, Object value) {
		return hairstyleService.findHairstyleByKey(key, value);
	}

	// Retrieve by name
	@GetMapping("Hairstyle/{name}")
	public String Hairstyle(@RequestParam("name") Hairstyle hairstyles) {
		return String.format("You have selected", hairstyles);
	}

	// Create a new Hairstyle into data
	@PostMapping("Hairstyle")
	public Hairstyle createHairstyles(@RequestBody Hairstyle hairstyles) {
		return hairstyleService.createHairstyles(hairstyles);
	}

	// Save/Update current Hairstyle data
	@PutMapping("Hairstyle/{name}")
	public Hairstyle saveHairstyles(@RequestBody Hairstyle hairstyles) {
		return hairstyleService.saveHairstyles(hairstyles);
	}

	// Delete a current Hairstyle in data
	@DeleteMapping("Hairstyle/{name}")
	public Hairstyle deleteHairstyles(@RequestParam("name") Hairstyle hairstyles) {
		return hairstyleService.deleteHairstyles(hairstyles);
	}
	/*
	 * {
	 * return String.format("You have deleted");
	 * }
	 */

}
