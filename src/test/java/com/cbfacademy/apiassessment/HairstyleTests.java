package com.cbfacademy.apiassessment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;

import com.cbfacademy.apiassessment.Hair.Hairstyle;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = Hairstyle.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HairstyleTests {

	@LocalServerPort
	private int port;

	private URL base;

	@Autowired
	private TestRestTemplate restTemplate;

	@BeforeEach
	public void setUp() throws Exception {
		this.base = new URL("http://localhost:" + port + "/Hairstyle");
	}

	@Test
	@Description("/greeting endpoint returns expected response for default name")
	public void greeting_ExpectedResponseWithDefaultName() {
		ResponseEntity<String> response = restTemplate.getForEntity(base.toString(), String.class);

		assertEquals(200, response.getStatusCode().value());
		assertEquals("Hello World", response.getBody());
	}

	@Test
	@Description("/greeting endpoint returns expected response for specified name parameter")
	public void greeting_ExpectedResponseWithNameParam() {
		ResponseEntity<String> response = restTemplate.getForEntity(base.toString() + "?name=John", String.class);

		assertEquals(200, response.getStatusCode().value());
		assertEquals("Hello John", response.getBody());
	}

	public class HairstyleTest {
		// Method to test the constructor of the class. Will initialise sample values to
		// test with
		@Test
		public void testConstructor() {
			int id = 1;
			String name = "TestStyle";
			Boolean wash = true;
			Boolean blowdry = false;
			Boolean treatment = true;
			Boolean assessment = false;
			String style = "3:00hrs";
			int price = 50;

			Hairstyle hairstyle = new Hairstyle(id, name, wash, blowdry, treatment, assessment, style, price);
			// Checking if the values match
			assertEquals(id, hairstyle.id);
			assertEquals(name, hairstyle.name);
			assertEquals(wash, hairstyle.wash);
			assertEquals(blowdry, hairstyle.blowdry);
			assertEquals(treatment, hairstyle.treatment);
			assertEquals(assessment, hairstyle.assessment);
			assertEquals(style, hairstyle.getStyle());// Using getStyle because these properties are private
			assertEquals(price, hairstyle.getPrice());
		}
	}
}
