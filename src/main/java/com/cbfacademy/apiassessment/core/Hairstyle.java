
package com.cbfacademy.apiassessment.core;
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
    private Boolean blowdry;
    public Boolean treatment;
    public Boolean assessment;
    private String style;
    private int price;

    public int getid() {
        return id;
    }

    public void setid(int ID) {
        this.id = ID;
    }

    public String getname() {
        return name;
    }

    public void setName(String N) {
        this.name = N;
    }

    public Boolean getwash() {
        return wash;
    }

    public void setWash(Boolean W) {
        this.wash = W;
    }

    public Boolean getblowdry() {
        return blowdry;
    }

    public void setblowdry(Boolean B) {
        this.blowdry = B;
    }

    public Boolean gettreatment() {
        return treatment;
    }

    public void settreatment(Boolean T) {
        this.treatment = T;
    }

    public Boolean getassessment() {
        return assessment;
    }

    public void setassessment(Boolean A) {
        this.assessment = A;
    }

    public String getstyle() {
        return style;
    }

    public void setstyle(String S) {
        this.style = S;
    }

    public int getprice() {
        return price;
    }

    public void setPrice(int P) {
        this.price = P;
    }

    // Includes the constructor
    public void Hairstyle(int id, String name, Boolean wash, Boolean blowdry, Boolean treatment,
            Boolean assessment, String style,
            int price) {
        this.id = id;
        this.name = name;
        this.wash = wash;
        this.blowdry = blowdry;
        this.treatment = treatment;
        this.assessment = assessment;
        this.style = style;
        this.price = price;
    }

    public String getDetails() {
        String details = String.format(
                "You have Enquired about the %N, This hairstyle will take %s and is priced at %P.");
        return details;
    }

}

// Inheritance of the Hairstyle class
class Braids extends Hairstyle {

    // Adds one field
    public int BraidhairCost;

    // Inheritance constructor and getters/setters
    public Braids(int BraidhairCost, int id, String name, Boolean wash, Boolean blowdry, Boolean treatment,
            Boolean assessment, String style,
            int price) {       

        public int getBraidhairCost() {
        return BraidhairCost;
    }

    public void setBraidhairCost(int BC) {
        this.BraidhairCost = BC;
    }
    
        // @Override public
        // Override Assessment,style or price
    }
}
