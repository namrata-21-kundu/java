//Box takes length, breadth, height as parameterised constructor, and returns volume
import java.util.*;
class Box{
    double length, breadth, height;
    Box(double length,double breadth,double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    double volume(){
        return length * breadth * height;
    }
}
public class FindingVolume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length breadth and height : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Box bo = new Box(l,b,h);
        System.out.println("Volume of box : " + bo.volume() + " cu cm");
    } 
}