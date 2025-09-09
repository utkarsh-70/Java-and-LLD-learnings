package Strategy_Design_Pattern.After_Implementation;

public class RubberDuckAfterImplementation extends DuckAfterImplementation{
    RubberDuckAfterImplementation(int legs,int wings,boolean swim){
        super(legs,wings,swim);
    }
    @Override 
    public void swim(){
        System.out.println("Rubber Duck cannot swim.");
    }
    @Override
    public void squeak(){
        System.err.println("The rubber duck cannot squeak");
    }
    @Override
    public void walk(){
        System.out.println("The rubber duck cannot walk");
    }
}
