package Strategy_Design_Pattern.After_Implementation;

public abstract class DuckAfterImplementation {
    private int hands;
    private int wings;
    private boolean beak;
    public DuckAfterImplementation(int hands, int wings, boolean beak) {
        this.hands = hands;
        this.wings = wings;
        this.beak = beak;
    }
    public abstract void swim();
    public abstract void walk();
    public abstract void squeak();
    public int getHands() {
        return hands;
    }
    public void setHands(int hands) {
        this.hands = hands;
    }
    public int getWings() {
        return wings;
    }
    public void setWings(int wings) {
        this.wings = wings;
    }
    public boolean isBeak() {
        return beak;
    }
    public void setBeak(boolean beak) {
        this.beak = beak;
    }
    
}
