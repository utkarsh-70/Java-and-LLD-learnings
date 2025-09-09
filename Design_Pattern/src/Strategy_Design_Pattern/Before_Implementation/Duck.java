package Strategy_Design_Pattern.Before_Implementation;

public class Duck {
    private int hands;
    private int legs;
    private int beak;
    public Duck(int hands, int legs, int beak) {
        this.hands = hands;
        this.legs = legs;
        this.beak = beak;
    }
    public void swim(){
        System.out.println("Swimming with hands");
    }

    public void walk(){
        System.out.println("Walking with legs");
    }
    public void squeak(){
        System.out.println("Squeaking");
    }
}
