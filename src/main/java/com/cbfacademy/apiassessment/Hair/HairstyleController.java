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
@RequestMapping("/Hairtyles")
public class HairstyleController {

	private final HairstyleService hairstyleService = new HairstyleService();

	/*
	 * public HairstyleController(HairstyleService hairstyleService) {
	 * this.hairstyleService = hairstyleService;
	 * }
	 */

	@GetMapping
	public List<Hairstyle> getAllHairstyles() throws IOException {
		return hairstyleService.getAllHairstyles();
	}

	@GetMapping
	public List<Hairstyle> findHairstyleByKey(String key, Object value) {
		return hairstyleService.findHairstyleByKey(key, value);
	}

	// CRUD Methods for retrieving, creating, updating and deleting

	// Retrieve by name
	@GetMapping("Hairstyle/{name}")
	public String Hairstyle(@RequestParam("name") String name) {
		return String.format("You have selected", name);
	}

	// Create a new Hairstyle into data
	@PostMapping("Hairstyle")
	public Hairstyle createHairstyle(@RequestBody Hairstyle hairstyle) {
		return hairstyleService.createHairstyle(hairstyle);
	}

	// Save/Update current Hairstyle data
	@PutMapping("Hairstyle")
	public Hairstyle saveHairstyle(List<Hairstyle> hairstyle) {
		return hairstyleService.saveHairstyle(hairstyle);
	}

	// Delete a current Hairstyle in data
	@DeleteMapping("Hairstyle/{name}")
	public Hairstyle deleteHairstyle(@RequestParam("name") String name) {
		return hairstyleService.deleteHairstyle(hairstyle);
	}
	/*
	 * {
	 * return String.format("You have deleted");
	 * }
	 */

	// Add endpoints for updating, deleting etc hairstyles
}
