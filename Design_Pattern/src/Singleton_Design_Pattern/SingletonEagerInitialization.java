package Singleton_Design_Pattern;

public class SingletonEagerInitialization {
    private static final SingletonEagerInitialization instance=new SingletonEagerInitialization();
    private SingletonEagerInitialization(){};
    public static SingletonEagerInitialization getSingleton_Eager_Initialization(){
        return instance;
    }
    public static void main(String[] args) {
        SingletonEagerInitialization instance=SingletonEagerInitialization.getSingleton_Eager_Initialization();
        System.out.println(instance);
        
    }
}
