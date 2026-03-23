import java.util.*;
interface Shapes {
    double getArea();
}
class Rectangle implements Shapes{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea(){
        return length * breadth;
    }
}
class Triangle implements Shapes{
    double base, height;
    Triangle(double base, double height){
        this.base = base;
        this.height= height;
    }
    public double getArea(){
        return 0.5 * base * height;
    }
}
public class Interface_Shape{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle obj1 = new Rectangle(l,b);
        System.out.println("area rectangle: "+ obj1.getArea());
        System.out.println("Enter base and height of triangle: ");
        double ba = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle obj2 = new Triangle(ba, h);
        System.out.println("area triangle: "+ obj2.getArea());
    }
}