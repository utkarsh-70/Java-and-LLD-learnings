package inheritance;

public class Car extends Vehicle {
    public int numDoors;
    public Car(String brand,int year,int numDoors){
        super(brand,year);
        this.numDoors=numDoors;
        
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Car started.");
    }
}
