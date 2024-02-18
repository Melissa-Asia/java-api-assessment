package com.cbfacademy.apiassessment.Hair;

import com.cbfacademy.apiassessment.Repositories.HairstyleRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Service is for the CRUD and does the logic

public class HairstyleService {
    private final HairstyleRepository hairstyleRepository;

    public HairstyleService(HairstyleRepository hairstyleRepository) {
        this.hairstyleRepository = hairstyleRepository;
    }

    // Retrieve a list of all Hairstyles.
    public List<Hairstyle> getAllHairstyles() {
        return hairstyleRepository.getAllHairstyles();
    }

    // Retrieve a Hairstyle by its name.
    public Hairstyle getHairstyleByName(String name) {
        return hairstyleRepository.getHairstyleByName(name);
    }

    // To create

    public String createHairstyle(Hairstyle hairstyle) throws IOException {
        hairstyleRepository.createHairstyle(hairstyle);
        return "Hairstyle added";
    }

    // Delete a Hairstyle by its name
    public String deleteHairstyle(String name) throws IOException {
        Hairstyle existingHairstyle = hairstyleRepository.getHairstyleByName(name);
        if (existingHairstyle != null) {
            hairstyleRepository.deleteHairstyle(name);
            return "Hairstyle deleted";
        } else {
            return "Hairstyle not found";
        }
    }

    // Update a new Hairstyle
    public String updateHairstyle(String name, Hairstyle newHairstyle) throws IOException {
        Hairstyle existingHairstyle = hairstyleRepository.getHairstyleByName (name);
        if (existingHairstyle !=null) {
            hairstyleRepository.updateHairstyle(name, newHairstyle);
            return "Hairstyle updated";
        }else{
            return "Hairstyle not found";
        }
        }

    if(!name.equals(newHairstyle.getName())&&hairstyles.contains(newHairstyle))

    {
        return "Hairstyle already available";
    }
}

    // Find a Hairstyle by a Json key
    public Hairstyle findHairstyleByKey(String key, Object value) {
        return hairstyleRepository.findHairstyleByKey(key, value);
    }
