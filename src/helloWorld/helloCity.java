package helloWorld;


public class helloCity {
    private String message ;
    private String city ;
    helloCity( String message , String city ){
        this.message = message ;
        this.city = city ;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void printMessage() {
        System.out.println( " Your message :" + this.message );
    }
    public String getMessage(){
        return this.message;
    }
    public String getCity() {
        return this.city;
    }
}
