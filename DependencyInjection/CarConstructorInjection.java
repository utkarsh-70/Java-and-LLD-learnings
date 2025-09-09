package DependencyInjection;
class Engine{
    private String engineType;
    Engine(String en){
        this.engineType=en;
    }
    public String getEngineType(){
        return engineType;
    }
}
public class CarConstructorInjection {
    private Engine engine;
    CarConstructorInjection(Engine en){
        this.engine=en;
    }
    public void drive(){
        System.out.println("Car is running with "+engine.getEngineType());
    }
    public static void main(String [] args){
        CarConstructorInjection newCar=new CarConstructorInjection(new Engine("Diesel Engine"));
        newCar.drive();
    }
}
