package com.cbfacademy.apiassessment.core;

import java.io.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
/* 
import java.util.List;
import java.util.*;
import java.util.HashMap;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
*/

public class SalonDesk {

    public String ID;
    public String Wash;
    public String Blowdry;
    public String treatment;
    public String Assessment;
    public String Style;
    public int Price;

    public SalonDesk(String ID, String Wash, String Blowdry, String treatment, String Assessment, String Style,
            int price) {
        this.ID = ID;
        this.Wash = Wash;
        this.Blowdry = Blowdry;
        this.treatment = treatment;
        this.Assessment = Assessment;
        this.Style = Style;
        this.Price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getWash() {
        return Wash;
    }

    public void setWash(String wash) {
        Wash = wash;
    }

    public String getBlowdry() {
        return Blowdry;
    }

    public void setBlowdry(String blowdry) {
        Blowdry = blowdry;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getAssessment() {
        return Assessment;
    }

    public void setAssessment(String assessment) {
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

    private static final SalonDesk[] SALON_DATA() throws FileNotFoundException {
        /*
         * BufferedReader bufferedReader = new BufferedReader(new
         * FileReader("com.cbfacademy.apiassessment.core.Data.Salon.json"));
         */
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("Salon.json"));
        SalonDesk[] data = gson.fromJson(reader, SalonDesk[].class); // contains the whole Salon list

        {
            return data;
        }

    }
}