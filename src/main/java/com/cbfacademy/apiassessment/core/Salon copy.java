package com.cbfacademy.apiassessment.core;

import java.util.List;
import java.util.HashMap;
import java.io.*;
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

{public String Hairstyles(String ID,String Wash,String Blowdry,String treatment,String Assessment,String Style,int price){this.ID=ID;this.Wash=Wash;this.Blowdry=Blowdry;this.treatment=treatment;this.Assessment=Assessment;this.Style=Style;this.Price=price;};

// Getters and Setters

public HashMap<String,String>Hairstyles()throws FileNotFoundException{String path="com.cbfacademy.apiassessment.core.Data - Jsonfiles./Salon.json";BufferedReader bufferedReader=new BufferedReader(new FileReader(path));

Gson gson=new Gson();HashMap<String,String>json=gson.fromJson(bufferedReader,HashMap.class);return json;}}
