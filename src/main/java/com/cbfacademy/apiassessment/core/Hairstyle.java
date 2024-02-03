
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
    public Boolean blowdry;
    public Boolean treatment;
    public Boolean assessment;
    public String style;
    public int price;

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
    public void Hairstyle_types(int id, String name, Boolean wash, Boolean blowdry, Boolean treatment,
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
                "You have Enquired about the %N, This hairstyle will take %s");
        return details;
    }

}

// Evidence of inheritance
class ShortHairstyle extends Hairstyle {
    public int level;
    public Boolean shapeup;
    public Boolean fullShave;

    // Inheritance getters and setters
    public ShortHairstyle(int level, Boolean shapeup, Boolean fullShave) {

        // @Override public
        // Override Assessment,style or price
    }
}
