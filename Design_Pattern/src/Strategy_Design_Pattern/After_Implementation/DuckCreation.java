package Strategy_Design_Pattern.After_Implementation;

public class DuckCreation {
    public static void main(String[] args) {
        RubberDuckAfterImplementation rubberDuck=new RubberDuckAfterImplementation(2, 0, false);
    rubberDuck.swim();
    rubberDuck.walk();
    rubberDuck.squeak();
    LakeDuckAfterImplementation lakeDuck=new LakeDuckAfterImplementation(2, 2,true);
    lakeDuck.swim();
    lakeDuck.walk();
    lakeDuck.squeak();
    }
    }
    
