package com.cbfacademy.apiassessment.Hair;
/* 
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
*/

//The Hairstyle class with java objects
public class Hairstyle {
    public int id;
    public String name;
    public Boolean wash;
    public Boolean blowdry;
    public Boolean treatment;
    public Boolean assessment;
    private String style;
    private int price;

    // Includes the constructor
    public Hairstyle(int ID, String Name, Boolean Wash, Boolean Blowdry, Boolean Treatment,
            Boolean Assessment, String Style,
            int Price) {

        this.id = ID;
        this.name = Name;
        this.wash = Wash;
        this.blowdry = Blowdry;
        this.treatment = Treatment;
        this.assessment = Assessment;
        this.style = Style;
        this.price = Price;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String N) {
        this.name = N;
    }

    public Boolean isWash() {
        return wash;
    }

    public void setWash(Boolean W) {
        this.wash = W;
    }

    public Boolean isBlowdry() {
        return blowdry;
    }

    public void setBlowdry(Boolean B) {
        this.blowdry = B;
    }

    public Boolean isTreatment() {
        return treatment;
    }

    public void setTreatment(Boolean T) {
        this.treatment = T;
    }

    public Boolean isAssessment() {
        return assessment;
    }

    public void setAssessment(Boolean A) {
        this.assessment = A;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String S) {
        this.style = S;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int P) {
        this.price = P;
    }

    @Override
    public String toString() {
        return "You have enquired about the [name " + name + "at £, + price]";
    }

    // Response when user retrieves their specified data
    public String getDetails() {
        String details = String.format(
                "You have Enquired about the %N, This hairstyle will take %s and is priced at %P.");
        return details;
    }

}
