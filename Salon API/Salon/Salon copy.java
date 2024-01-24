import java.util.List;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class Salon {

    public String ID;
    public String Wash;
    public String Blowdry;
    public String treatment;
    public String Assessment;
    public String Style;
    public Int Price;

    public Salon() {

    }

    Public Hairstyles(String ID, String Wash, String Blowdry, String treatment, String Assessment, String Style,
            Int price) {
        this.ID = ID;
        this.Wash = Wash;
        this.Blowdry = Blowdry;
        this.treatment = treatment;
        this.Assessment = Assessment;
        this.Style = Style;
        this.price = price;
    };

    // Getters and Setters

    public HashMap<String, String> Hairstyles() throws FileNotFoundException {
        String path = "C:\\Users\\Melissa Asiamah\\Desktop\\Front-end coding\\RESTful API - Java project\\java-api-assessment\\Salon API\\Salon\\Salon.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        Gson gson = new Gson();
        HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
        return json;
    }
}
