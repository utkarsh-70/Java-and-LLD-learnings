package Strategy_Design_Pattern.Before_Implementation;

public class Duck {
    private int legs;
    private int wings;
    private boolean squeak;
    public Duck(int legs, int wings, boolean squeak) {
        this.legs = legs;
        this.wings = wings;
        this.squeak = squeak;
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
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public int getWings() {
        return wings;
    }
    public void setWings(int wings) {
        this.wings = wings;
    }
    public boolean isSqueak() {
        return squeak;
    }
    public void setSqueak(boolean squeak) {
        this.squeak = squeak;
    }
    
    
}
