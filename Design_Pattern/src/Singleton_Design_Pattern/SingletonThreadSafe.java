package Singleton_Design_Pattern;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe(){};
    public static synchronized SingletonThreadSafe getInstance(){
        if(instance==null){
            instance=new SingletonThreadSafe();

        }
        return instance;
    }
    public static void main(String[] args){
        SingletonThreadSafe instance=SingletonThreadSafe.getInstance();
        System.out.println("The created instance is"+instance);
    }
}
