package inheritance;

public class Vehicle {
    String brand;
    int year;
    public Vehicle(String br,int y){
        this.brand=br;
        this.year=y;
    }
    public void start(){
        System.out.println("Vehicle started.");
    }
    public void stop(){
        System.out.println("Vehicle stopped.");
    }
}
