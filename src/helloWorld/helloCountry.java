package helloWorld;

import org.jetbrains.annotations.NotNull;

public class helloCountry {
    private String message ;
    private String country , capital ;
    private helloCity  capitalCity ;
    helloCountry(String country , @NotNull helloCity Capital , String message ){
        this.country = country ;
        this.capital = Capital.getCity() ;
        this.message = message ;
        this.capitalCity = Capital ;
    }
    public String getMessage() {
        return this.message;
    }
    public String getCountry() {
        return this.country;
    }
    public String getCapital() {
        return this.capital;
    }
    public void printCountry(){
        System.out.println("Country : " + this.country + " , message : " + this.message );
    }
    public void printCapital(){
        System.out.println("Capital : " + this.capitalCity.getCity() + " , message : " + this.capitalCity.getMessage() );
    }
}
