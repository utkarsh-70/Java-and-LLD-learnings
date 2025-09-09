package Strategy_Design_Pattern.After_Implementation;
public class LakeDuckAfterImplementation extends DuckAfterImplementation{
    LakeDuckAfterImplementation(int legs,int wings,boolean swim){
        super(legs, wings, swim);
    }

    @Override 
    public void swim(){
        System.out.println("Lake duck can swim properly");
    }
    @Override
    public void squeak(){
        System.err.println("The lake duck will squeak");
    }
    @Override
    public void walk(){
        System.out.println("The public duck will walk");
    }
}
