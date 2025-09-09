package Strategy_Design_Pattern.Before_Implementation;

public class LakeDuck extends Duck{
    public String waterType;

    public LakeDuck(int hands, int legs, int beak, String waterType) {
        super(hands, legs, beak);
        this.waterType = waterType;
    }
    @Override
    public void swim(){
        System.out.println("Swimming with hands and legs");
    }

}
