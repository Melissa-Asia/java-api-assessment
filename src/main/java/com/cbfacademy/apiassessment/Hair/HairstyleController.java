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
	private final HairstyleService hairstyleService

	 public HairstyleController() throws IOException {
	 this.hairstyleService = new HairstyleService("Hairstyle.json");
	  }
	 
	// Retrieve all
	@GetMapping
	public List<Hairstyle> getAllHairstyles() throws IOException {
		return hairstyleService.getAllHairstyles();
	}

	// Find by Json key
	@GetMapping
	public Hairstyle findHairstyleByKey(String key, Object value) {
		return hairstyleService.findHairstyleByKey(key, value);
	}

	// Retrieve by name
	@GetMapping("Hairstyle/{name}")
        public String getHairstyleByName(@PathVariable String name) {
        Hairstyle hairstyle = hairstyleService.getHairstyleByName(name);
        return hairstyle != null ? hairstyle.toString() : "Hairstyle not found";
	}

	// Create a new Hairstyle into data
	@PostMapping("Hairstyle")
	public String createHairstyles(@RequestBody Hairstyle hairstyles) {
		try{
		return hairstyleService.createHairstyles(hairstyles);
		} catch (IOException e){
		return "File not found";
		}
	}

	// Update current Hairstyle data
	@PutMapping("Hairstyle/{name}")
	public String UpdateHairstyle(@PathVariable String name, @RequestBody) {
		try{
		return hairstyleService.updateHairstyles(name, newHairstyle);
		} catch (IOException e) {
		return "File not found";
		}
	}

	// Delete a current Hairstyle in data
	@DeleteMapping("Hairstyle/{name}")
	public String deleteHairstyle(@RequestParam("name") Hairstyle hairstyles) {
		try{
		return hairstyleService.deleteHairstyles(hairstyles);
		} catch (IOException e) {
		return "File not Found";
		}	
	}
}
