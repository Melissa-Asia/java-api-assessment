package com.cbfacademy.apiassessment.Hair;

//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cbfacademy.apiassessment.core.SalonDesk;

//Acesses the endpoints to gt application - very little logic
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/hairtyles")
public class HairstyleController {
	private final HairstyleService hairstyleService;

	public HairstyleController(HairstyleService hairstyleService) {
		this.hairstyleService = hairstyleService;
	}

	@GetMapping
	public List<Hairstyle> getAllHairstyles() throws IOException {
		return hairstyleService.getAllHairstyles(Hair, );
	}
	/*
	 * @PostMapping
	 * public void createHairstyle(@RequestBody Hairstyle hairstyle) throws
	 * IOException {
	 * List<Hairstyle> hairstyles = salonDesk.getAllHairstyles();
	 * hairstyles.add(hairstyle);
	 * salonDesk.saveHairstyles(hairstyles);
	 * }
	 */
	// CRUD Methods for retrieving, creating, updating and deleting

	// Retrieve by name
	@GetMapping("Hairstyle/{name}")
	public String Hairstyle(@RequestParam("name") String name) {
		return String.format("You have selected", name);
	}

	// Create a new Hairstyle into data
	@PostMapping("Hairstyle")
	public Hairstyle createHairstyle(Hairstyle H1) {
		System.out.println(H1);

		return H1;
	}

	// Update current Hairstyle data
	@PutMapping("Hairstyle")
	public Hairstyle updateHairstyle(Hairstyle H1) {
		System.out.println(H1);

		return H1;
	}

	// Delete a current Hairstyle in data
	/*
	 * @DeleteMapping("Hairstyle/{name}")
	 * public Hairstyle deleteHairstyle(@RequestParam("name")String name){
	 * return String.format("You have deleted", name);
	 * }
	 * //{
	 * 
	 * //Add more
	 * //return a;
	 */

	// Add endpoints for updating, deleting etc hairstyles
}
