package Singleton_Design_Pattern;

public class SingletonLazyInitialization {
    public static SingletonLazyInitialization instance=null;
    private SingletonLazyInitialization(){};
    public static SingletonLazyInitialization getSingletonLazyInstance(){
        if(instance==null){
            instance=new SingletonLazyInitialization();
            return instance;
        }
        else{
            return instance;
        }
    }
    public static void main(String[] args) {
        SingletonLazyInitialization instance=SingletonLazyInitialization.getSingletonLazyInstance();
        System.out.println("The instance variable created successfully"+instance);
    }
}
