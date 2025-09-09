package Strategy_Design_Pattern.Before_Implementation;

public class LakeDuck extends Duck{
    public String waterType;

    public LakeDuck(int legs, int wings, boolean squeak, String waterType) {
        super(legs,wings, squeak);
        this.waterType = waterType;
    }
    @Override
    public void swim(){
        System.out.println("Swimming with hands and legs");
    }

}
