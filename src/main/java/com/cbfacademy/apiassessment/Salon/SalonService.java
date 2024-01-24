package com.cbfacademy.apiassessment.Salon;

import java.util.List;
import java.util.UUID;

public interface SalonService {

    /**
     * Retrieve a list of all IOUs.
     *
     * @return A list of all IOUs.
     */
    List<Salon> getAllSalons();

    /**
     * Retrieve an IOU by its ID.
     *
     * @param id The ID of the IOU to retrieve.
     * @return The IOU with the specified ID, or null if not found.
     */
    Salon getSalon(UUID id);

    /**
     * Create a new IOU.
     *
     * @param iou The IOU object to create.
     * @return The created IOU.
     */
    Salon createSalon(Salon iou);

    /**
     * Update an existing IOU by its ID.
     *
     * @param id           The ID of the IOU to update.
     * @param updatedSalon The updated IOU object.
     * @return The updated IOU, or null if the ID is not found.
     */
    Salon updateSalon(UUID id, Salon updatedIOU);

    /**
     * Delete an IOU by its ID.
     *
     * @param id The ID of the IOU to delete.
     */
    void deleteSalon(UUID id);

}