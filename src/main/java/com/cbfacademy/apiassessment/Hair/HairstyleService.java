package com.cbfacademy.apiassessment.Hair;

import java.util.List;
//import java.util.UUID;

//Service is for the CRUD and does the logic

public class HairstyleService {
    private final HairstyleRepository hairstyleRepository = new HairstyleRepository();

    // Retrieve a list of all Hairstyles.
    public List<Hairstyle> getAllHairstyle() {
        return hairstyleRepository.getAllHairstyles();
    }

    // Retrieve a Hairstyle by its name.
    public List<Hairstyle> getAllHairstyle(String name) {
        return hairstyleRepository.getAllHairstyles();
    }

    // Create a new Hairstyle.
    public List<Hairstyle> saveAllHairstyle(String name) {
        return hairstyleRepository.save(hairstyles);
    }

    /**
     * Update an existing Hairstyle by its name.
     *
     * @param id               The name of the Hairstyle to update.
     * @param updatedHairstyle The updated Hairstyle object.
     * @return The updated Hairstyle, or null if the name is not found.
     */
    Hairstyle updateHairstyle(String name, Hairstyle updatedHairHairstyle);

    /**
     * Delete a Hairstyle by its name.
     *
     * @param name The name of the Hairstyle to delete.
     */
    void deleteHairstyle(String name);

    /**
     * Save a new Hairstyle.
     *
     * @param name The Hairstyle object to save.
     * @return The saved Hairstyle.
     */
    Hairstyle saveHairstyle(String name);

    public Hairstyle findHairstyleByKey(String key, Object value) {
        return hairstyleRepository.findHairstyleByKey(key, value);
    }
}
