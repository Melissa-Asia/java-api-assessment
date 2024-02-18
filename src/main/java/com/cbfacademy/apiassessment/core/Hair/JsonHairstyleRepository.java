package com.cbfacademy.apiassessment.core.Hair;

import java.util.List;
import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

//import com.cbfacademy.apiassessment.Repositories.Repository;

// Repository is for searching the file 

public class JsonHairstyleRepository implements HairstyleRepository {
    private final String filePath = "Hairstyles.json";
    private final Gson gson = new Gson();

    public List<Hairstyle> getAllHairstyles() {
        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Hairstyle>>() {
            }.getType();
            List<Hairstyle> hairstyles = gson.fromJson(reader, listType);
            // binary search algorithm - hairstyles must be sorted by id
            // h1 and h2 represent a first obect and a second. Collections.sort
            Collections.sort(hairstyles, (h1, h2) -> h1.getID() - h2.getID());
            return hairstyles;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // To save
    public void saveHairstyle(List<Hairstyle> hairstyles) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(hairstyles, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // To delete
    public void deleteHairstyle(List<Hairstyle> hairstyles) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(hairstyles, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // To create
    public void createHairstyle(List<Hairstyle> hairstyles) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(hairstyles, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // To update
    public void updateHairstyle(List<Hairstyle> hairstyles) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(hairstyles, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Algorithm to search by different keys from the Json File
    // Using the switch to be able to handle the different keys
    public Hairstyle findHairstyleByKey(String key, Object value) {
        List<Hairstyle> hairstyles = getAllHairstyles();
        if (hairstyles == null || hairstyles.isEmpty()) {
            return null;
        }

        int left = 0;
        int right = hairstyles.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Hairstyle current = hairstyles.get(mid);
            switch (key) {
                case "ID":
                    if (current.getID() == (int) value) {
                        return current;
                    } else if (current.getID() < (int) value) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                    break;
                case "Name":
                    if (current.getName().equals(value)) {
                        return current;
                    } else if (current.getName().compareTo((String) value) < 0) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                    break;
                case "Wash":
                    if (current.isWash() == (boolean) value) {
                        return current;
                    } else if (current.isWash() && !((boolean) value)) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                    break;
                // Add cases for other keys (Blowdry, Treatment, Assessment, Style, price)
                // similarly
                default:
                    return null; // Invalid key
            }
        }
        return null; // Hairstyle not found
    }
}

/*
 * 
 * public interface HairstyleRepository extends Repository<Salon, UUID> {
 * 
 * /**
 * Searches for IOUs where the borrower's name matches the provided string.
 *
 * @param name the name of the borrower
 * 
 * @return a list of IOUs that match the borrower's name
 * 
 * List<Salon> searchByHairstyle(String name);
 * 
 * 
 * Searches for IOUs where the lender's name matches the provided string.
 *
 * @param name the name of the lender
 * 
 * @return a list of IOUs that match the lender's name
 * 
 * List<Sallon> searchByPrice(String name);
 * 
 */
