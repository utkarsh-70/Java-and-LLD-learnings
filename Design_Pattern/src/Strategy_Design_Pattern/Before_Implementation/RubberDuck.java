package Strategy_Design_Pattern.Before_Implementation;

public class RubberDuck extends Duck{
    private String rubberType;

    
    
    public RubberDuck(int legs, int wings, boolean squeak, String rubberType) {
        super(legs, wings, squeak);
        this.rubberType = rubberType;
    }



    @Override
    public void squeak(){
        System.out.println("Rubber Duck does not squeak.");
    }
   
}
