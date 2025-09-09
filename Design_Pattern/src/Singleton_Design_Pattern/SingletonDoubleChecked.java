package Singleton_Design_Pattern;

public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked instance;
    private SingletonDoubleChecked(){};

    public static SingletonDoubleChecked getInstance(){
        if(instance==null){
            synchronized (SingletonDoubleChecked.class){
                if(instance==null){
                    instance=new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        SingletonDoubleChecked instance=getInstance();
        System.out.println("The created instance is"+instance);
    }
}
