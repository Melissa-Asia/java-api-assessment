package com.cbfacademy.apiassessment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Description;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        String style = "TestStyle";
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
