package com.cbfacademy.apiassessment.core;

import com.cbfacademy.apiassessment.Hairstyles.Hairstyle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/*
 * import java.io.FileNotFoundException;
 * import java.io.FileInputStream;
 * import com.google.gson.stream.JsonReader;
 * import java.util.*;
 * import java.util.HashMap;
 * import java.lang.reflect.Type;
 * import java.text.SimpleDateFormat;
 * import java.util.Date;
 * import com.google.gson.JsonElement;
 * import com.google.gson.JsonPrimitive;
 * import com.google.gson.JsonSerializationContext;
 * import com.google.gson.JsonSerializer;
 * import com.google.gson.JsonArray;
 * import com.google.gson.JsonObject;
 * import com.google.gson.JsonParser;
 * import java.nio.charset.StandardCharsets;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 * import java.nio.file.Paths;
 * 
 * 
 * //Connect the Json file to Java using Gson. Allows for the Json file to be
 * read and written into
 * 
 * public class SalonDesk {
 * private final String filepath =
 * "C:\\Users\\Melissa Asiamah\\Desktop\\Front-end coding\\RESTful API - Java project\\java-api-assessment\\src\\main\\java\\com\\cbfacademy\\apiassessment\\core\\Data"
 * ;
 * private final Gson gson = new Gson();
 * 
 * public List<Hairstyle> getAllHairstyles() throws IOException {
 * FileReader fileReader = new FileReader("Hairstyles.json");
 * Type type = new TypeToken<List<Hairstyle>>() {
 * }.getType();
 * List<Hairstyle> hairstyles = gson.fromJson(filepath, );
 * fileReader.close();
 * return hairstyles;
 * }
 * 
 * public void saveHairstyles(List<Hairstyle> hairstyles) throws IOException {
 * FileWriter fileWriter = new FileWriter("Hairstyles.json");
 * gson.toJson(hairstyles, fileWriter);
 * fileWriter.close();
 * }
 * 
 * // Add methods to create, update, and delete hairstyles (CRUD)
 * }
 */