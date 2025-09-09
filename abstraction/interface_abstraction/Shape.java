package abstraction.interface_abstraction;
import java.util.*;
public interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape{
    private double radius;
    public Circle(double rad){
        this.radius=rad;
    }
    public double area(){
        return 3.14*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*3.14*this.radius;
    }
}
class Rectangle implements Shape{
    private double length;
    private double breadth;
    public Rectangle(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    public double area(){
        return this.length*this.breadth;
    }
    public double perimeter(){
        return 2*(this.length+this.breadth);
    }
}
class Main{
    public static void main(String[] args) {
        Circle obj=new Circle(4.0);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
        Rectangle obj2=new Rectangle(2.1,4.1);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());

    }
}