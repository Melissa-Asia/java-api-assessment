
/*Create Hashmap */
import java.util.HashSet;

Public class Main{

    Public static void main(String []args){
        HashSet<String, String> Hairstyles = new HashSet<String>();
        Hairstyles.add("Weave");
        Hairstyles.add ("Braids");

        System.out.println(Hairstyles);
    }
}

/*Create customer base*/
/*Defining Class*/
public class Customer{
    public static String STATUS = "Non-Member";
/*Adding attributes */
    String firstname;
    String lastname;
    String status;

public Customer(String firstname, String lastname, String status){
    this.firstname = firstname;
    this.lastname = lastname;
    this.status = status;
}
   
System.out.println("Welcome " + firstname + lastname + "You are currently a " +status);

}







