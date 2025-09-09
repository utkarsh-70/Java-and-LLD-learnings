package Strategy_Design_Pattern.Before_Implementation;

public class RubberDuck extends Duck{
    private String rubberType;

    public RubberDuck(int hands, int legs, int beak, String rubberType) {
        super(hands, legs, beak);
        this.rubberType = rubberType;
    }
    
    @Override
    public void squeak(){
        System.out.println("Rubber Duck does not squeak.");
    }
   
}
