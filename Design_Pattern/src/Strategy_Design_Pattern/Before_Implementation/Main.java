package Strategy_Design_Pattern.Before_Implementation;

public class Main {
    public static void main(String[] args) {
        Duck rubberDuck=new RubberDuck(1, 2, 1, "Synthetic Rubber");
        rubberDuck.squeak();
        rubberDuck.swim();
        rubberDuck.walk();
    }
    
}
