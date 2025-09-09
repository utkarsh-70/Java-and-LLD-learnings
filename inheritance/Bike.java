package inheritance;

public class Bike extends Vehicle{
    boolean hasCarrier;
    public Bike(String brand,int year,boolean hasCarrier){
        super(brand,year);
        this.hasCarrier=hasCarrier;
        
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Bike started.");
    }
}
