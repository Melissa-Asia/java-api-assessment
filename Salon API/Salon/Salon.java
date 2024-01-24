/*
 * import java.util.List;
 * 
 * public class Salon {
 * 
 * public String ID;
 * public String Wash;
 * public String Blowdry;
 * public String treatment;
 * public String Assessment;
 * public String Style;
 * public Int Price;
 * 
 * public Salon(){
 * 
 * }
 * 
 * Public Salon(String ID, String Wash, String Blowdry, String treatment, String
 * Assessment, String Style, Int price){
 * this.ID = ID;
 * this.Wash = Wash;
 * this.Blowdry = Blowdry;
 * this.treatment = treatment;
 * this.Assessment = Assessment;
 * this.Style = Style;
 * this.price = price;
 * }
 * 
 * //Getters and Setters
 * }
 * 
 * try {
 * // create Gson instance
 * Gson gson = new Gson();
 * 
 * // create a reader
 * Reader reader = Files.newBufferedReader(Paths.get("Salon.json"));
 * // convert a JSON string to a Salon object
 * Salon salon = gson.fromJson(reader, Salon.class);
 * 
 * // print user object
 * System.out.println(salon);
 * 
 * // close reader
 * reader.close();
 * 
 * } catch (Exception ex)
 * {
 * ex.printStackTrace();
 * }
 */
