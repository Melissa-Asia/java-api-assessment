/*
 * package com.cbfacademy.apiassessment.core;
 * 
 * import java.util.List;
 * import java.io.FileNotFoundException;
 * import java.io.FileReader;
 * import java.io.IOException;
 * import java.io.JSONFileHandler;
 * 
 * public class JSONFileHandler {
 * public List<String> readFile(String Salon.json);
 * 
 * public void save(Salon salon, String outputFile);
 * }
 * 
 * 
 * public HashMap<String,String>Hairstyles()throws FileNotFoundException{String
 * path="com.cbfacademy.apiassessment.core.Data - Jsonfiles./Salon.json"
 * ;BufferedReader bufferedReader=new BufferedReader(new FileReader(path));
 * 
 * Gson gson=new
 * Gson();HashMap<String,String>json=gson.fromJson(bufferedReader,HashMap.class)
 * ;return json;}}
 */

import org.yaml.snakeyaml.events.Event.ID;

public class Hairstyles {
    public int ID;
    public Boolean Wash;
    public Boolean Blowdry;
    public Boolean treatment;
    public Boolean Assessment;
    public String Style;
    public int Price;

    public void SalonDesk(int id, Boolean Wash, Boolean Blowdry, Boolean treatment, Boolean Assessment, String Style,
            int price) {
        this.id = id;
        this.Wash = Wash;
        this.Blowdry = Blowdry;
        this.treatment = treatment;
        this.Assessment = Assessment;
        this.Style = Style;
        this.Price = price;
    }

    public int getid() {
        return ID;
    }

    public void setid(int id) {
        ID = id;
    }

    public Boolean getWash() {
        return Wash;
    }

    public void setWash(Boolean wash) {
        Wash = wash;
    }

    public Boolean getBlowdry() {
        return Blowdry;
    }

    public void setBlowdry(Boolean blowdry) {
        Blowdry = blowdry;
    }

    public Boolean getTreatment() {
        return treatment;
    }

    public void setTreatment(Boolean treatment) {
        this.treatment = treatment;
    }

    public Boolean getAssessment() {
        return Assessment;
    }

    public void setAssessment(Boolean assessment) {
        Assessment = assessment;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
