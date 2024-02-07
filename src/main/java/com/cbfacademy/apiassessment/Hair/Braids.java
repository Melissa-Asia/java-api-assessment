package com.cbfacademy.apiassessment.Hair;

// Inheritance of the Hairstyle class
public class Braids extends Hairstyle {

    // Adds one field
    public int Braidhair;

    // Inheritance constructor
    public Braids(int BraidhairCost, int id, String name, Boolean wash, Boolean blowdry, Boolean treatment,
            Boolean assessment, String style,
            int price) {
        super(id, name, wash, blowdry, treatment, assessment, style, price);
        Braidhair = BraidhairCost;
    }

    // Getters and setters
    public int getBraidhairCost() {
        return Braidhair;
    }

    public void setBraidhairCost(int BH) {
        this.Braidhair = BH;
    }
}
