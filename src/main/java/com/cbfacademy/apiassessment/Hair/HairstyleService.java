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

    // Save a new Hairstyle.
    public void saveAllHairstyles(Hairstyle hairstyles) {
        hairstyleRepository.saveAllHairstyles(hairstyles);
    }

    /**
     * Update an existing Hairstyle by its name.
     * 
     * @param id               The name of the Hairstyle to update.
     * @param updatedHairstyle The updated Hairstyle object.
     * @return The updated Hairstyle, or null if the name is not found.
     */
    public List<Hairstyle> updateHairstyles(Hairstyle updatedhairstyles) {
        return hairstyleRepository.updateHairstyles();
    }

    // Delete a Hairstyle by its name.
    public List<Hairstyle> deleteHairstyles(Hairstyle hairstyles) {
        return hairstyleRepository.deleteHairstyles();
    }

    // Save a new Hairstyle.
    Hairstyle saveHairstyles(Hairstyle hairstyles);

    // Find a Hairstyle by a Json key
    public Hairstyle findHairstyleByKey(String key, Object value) {
        return hairstyleRepository.findHairstyleByKey(key, value);
    }
}
