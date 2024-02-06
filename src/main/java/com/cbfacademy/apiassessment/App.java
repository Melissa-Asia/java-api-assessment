/*
 * package com.cbfacademy.apiassessment;
 * 
 * import org.springframework.boot.SpringApplication;
 * import org.springframework.boot.autoconfigure.SpringBootApplication;
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.PutMapping;
 * import org.springframework.web.bind.annotation.PostMapping;
 * //import org.springframework.web.bind.annotation.DeleteMapping;
 * import org.springframework.web.bind.annotation.RequestParam;
 * import org.springframework.web.bind.annotation.RestController;
 * import com.cbfacademy.apiassessment.core.Hairstyle;
 * 
 * @SpringBootApplication
 * 
 * @RestController
 * public class App {
 * 
 * public static void main(String[] args) {
 * SpringApplication.run(App.class, args);
 * }
 * 
 * @GetMapping("/Hairstyle")
 * public Hairstyle getHairstyle(Hairstyle H1) {
 * System.out.println(H1);
 * 
 * return H1;
 * }
 * 
 * // CRUD Methods for retrieving, creating, updating and deleting
 * 
 * // Retrieve by name
 * 
 * @GetMapping("Hairstyle/{name}")
 * public String Hairstyle(@RequestParam("name") String name) {
 * return String.format("You have selected", name);
 * }
 * 
 * // Create a new Hairstyle into data
 * 
 * @PostMapping("Hairstyle")
 * public Hairstyle createHairstyle(Hairstyle H1) {
 * System.out.println(H1);
 * 
 * return H1;
 * }
 * 
 * // Update current Hairstyle data
 * 
 * @PutMapping("Hairstyle")
 * public Hairstyle updateHairstyle(Hairstyle H1) {
 * System.out.println(H1);
 * 
 * return H1;
 * }
 * 
 * // Delete a current Hairstyle in data
 * /*
 * 
 * @DeleteMapping("Hairstyle/{name}")
 * public Hairstyle deleteHairstyle(@RequestParam("name")String name){
 * return String.format("You have deleted", name);
 * }
 * //{
 * 
 * //Add more
 * //return a;
 * 
 * 
 * }
 */