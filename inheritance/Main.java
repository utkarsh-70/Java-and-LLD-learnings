package inheritance;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter car brand: ");
        String carBr=sc.nextLine();
        System.out.print("Enter year: ");
        int carYr=sc.nextInt();
        System.out.print("Enter number of doors:");
        int doors=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter bike brand: ");
        String bikeBr=sc.nextLine();
        System.out.print("Enter year: ");
        int bikeYr=sc.nextInt();
        System.out.print("Does the bike have a carrier? ");
        boolean cr=sc.nextBoolean();
        Car objCar=new Car(carBr,carYr,doors);
        Bike objBike=new Bike(bikeBr,bikeYr,cr);
        objCar.start();
        objCar.stop();
        objBike.start();


    }
}
