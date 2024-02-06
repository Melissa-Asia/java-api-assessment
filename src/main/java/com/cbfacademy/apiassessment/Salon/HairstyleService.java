package com.cbfacademy.apiassessment.Salon;

import java.util.List;
//import java.util.UUID;

import com.cbfacademy.apiassessment.core.Hairstyle;

//Service is for the CRUD and does the logic
public interface HairstyleService {

    /**
     * Retrieve a list of all Hairstyles.
     *
     * @return A list of all Hairstles.
     */
    List<Hairstyle> getAllHairstyle();

    /**
     * Retrieve a Hairstyle by its name.
     *
     * @param name The ID of the IOU to retrieve.
     * @return The Hairstyle with the specified name, or null if not found.
     */
    Hairstyle getHairstyle(String name);

    /**
     * Create a new Hairstyle.
     *
     * @param name The Hairstyle object to create.
     * @return The created Hairstyle.
     */
    Hairstyle createHairstyle(String name);

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

}