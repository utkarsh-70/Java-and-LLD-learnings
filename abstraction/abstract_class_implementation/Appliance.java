package abstraction.abstract_class_implementation;

abstract class Appliance {
    String brand;
    public Appliance(String brand){
        this.brand=brand;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public void showBrand(){
        System.out.println("The Brand is: "+this.brand);
    }
}
class WashingMachine extends Appliance{
    public WashingMachine(String brand){
        super(brand);
    }
    public void turnOn(){
       System.out.println("The Washing machine got turned on"); 
    }
    public void turnOff(){
        System.out.println("The Washing machine got turned off");
    }
}
class Refrigirator extends Appliance{
    public Refrigirator(String brand){
        super(brand);
    }
    public void turnOn(){
        System.out.println("The Refrigirator got turned on");
    }
    public void turnOff(){
        System.out.println("The Refrigirator got turned on");
    }
}
class Main{
    public static void main(String[] args){
        WashingMachine ob1=new WashingMachine("LG");
        ob1.turnOn();
        ob1.showBrand();
        Refrigirator ob2=new Refrigirator("Samsung");
        ob2.turnOn();
        ob2.showBrand();
    }
}