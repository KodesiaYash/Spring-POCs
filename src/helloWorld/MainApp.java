package helloWorld;
import org.springframework.context.ApplicationContext ;
import org.springframework.context.support.ClassPathXmlApplicationContext ;
import java.util.*;

public class MainApp {
    public static void main ( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml" );
        helloCity NewDelhi = (helloCity) context.getBean("New Delhi") ;
        helloCity Bern = (helloCity) context.getBean("Bern") ;
        helloCity Rome = (helloCity) context.getBean("Rome") ;
        NewDelhi.printMessage();
        Bern.printMessage();
        Rome.printMessage();
        helloCountry India = (helloCountry) context.getBean("India") ;
        helloCountry Switzerland = (helloCountry) context.getBean("Switzerland") ;
        helloCountry Italy = (helloCountry) context.getBean("Italy") ;
        India.printCountry();
        India.printCapital();
        Italy.printCountry();
        Italy.printCapital();
        Switzerland.printCountry();
        Switzerland.printCapital();
        helloWorld World = (helloWorld)context.getBean("World") ;
        World.setCountry("India");
        World.setCountry("Japan");
        List<countryAndCapital> lst= World.getCountries() ;
        for ( countryAndCapital temp : lst ){
            System.out.println(temp.getCountry() + " " + temp.getCapital() );
        }
    }
}
