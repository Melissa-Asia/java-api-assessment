package com.cbfacademy.apiassessment.Hair;

import java.util.List;
//import java.util.UUID;

//Service is for the CRUD and does the logic

public class HairstyleService {
    private final HairstyleRepository hairstyleRepository = new HairstyleRepository();

    // Retrieve a list of all Hairstyles.
    public List<Hairstyle> getAllHairstyles() {
        return hairstyleRepository.getAllHairstyles();
    }

    // Retrieve a Hairstyle by its name.
    public List<Hairstyle> getAllHairstyles(Hairstyle hairstyles) {
        return hairstyleRepository.getAllHairstyles();
    }

    /**
     * Update an existing Hairstyle by its name.
     * 
     * @param id               The name of the Hairstyle to update.
     * @param updatedHairstyle The updated Hairstyle object.
     * @return The updated Hairstyle, or null if the name is not found.
     */
    /*
     * public Hairstyle updateHairstyles(Hairstyle updatedhairstyles) {
     * return hairstyleRepository.updateHairstyles();
     * }
     */

    public List<Hairstyle> createHairstyles(Hairstyle updatedhairstyles) {
        return hairstyleRepository.createHairstyles();
    }

    // Delete a Hairstyle by its name.
    public Hairstyle deleteHairstyles(Hairstyle hairstyles) {
        return hairstyleRepository.deleteHairstyles();
    }

    // Save a new Hairstyle.
    public Hairstyle saveHairstyles(Hairstyle hairstyles) {
        return hairstyleRepository.saveHairstyles();
    }

    // Find a Hairstyle by a Json key
    public Hairstyle findHairstyleByKey(String key, Object value) {
        return hairstyleRepository.findHairstyleByKey(key, value);
    }
}
