package helloWorld;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext ;
import java.util.*;
public class helloWorld {
    private  String message ;
    private  List<countryAndCapital> countries =new ArrayList<countryAndCapital>();
    public helloWorld(){
        System.out.println("World is being created");
    }
    public  void setMessage(String imessage) {
        this.message = imessage;
    }
    public  String getMessage() {
        return this.message;
    }
    public  List<countryAndCapital> getCountries(){
        return this.countries ;
    }

    public void setCountry(String countryName) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            helloCountry Country = (helloCountry) context.getBean(countryName);
            if (Country != null) {
                countryAndCapital newEntry = new countryAndCapital(Country.getCountry(), Country.getCapital());
                this.countries.add(newEntry);
            }
        }catch(Exception err){
            System.out.println("Error" + err );
        }
    }
}