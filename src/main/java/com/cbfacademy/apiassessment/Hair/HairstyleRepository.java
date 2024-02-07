package com.cbfacademy.apiassessment.Hair;

import java.util.List;
import java.util.UUID;

import com.cbfacademy.apiassessment.Repositories.Repository;

// Repository is for searching the file 

public interface HairstyleRepository extends Repository<Salon, UUID> {

    /**
     * Searches for IOUs where the borrower's name matches the provided string.
     *
     * @param name the name of the borrower
     * @return a list of IOUs that match the borrower's name
     */
    List<Salon> searchByHairstyle(String name);

    /**
     * Searches for IOUs where the lender's name matches the provided string.
     *
     * @param name the name of the lender
     * @return a list of IOUs that match the lender's name
     */
    List<Sallon> searchByPrice(String name);

}