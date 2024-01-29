package com.cbfacademy.apiassessment.core;

import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;

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