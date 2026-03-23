import java.util.*;
class Person{
    double salary, income;
    Person(double income){
        this.income = income;
    }
    void display(){
        System.out.println("salary " + salary);
    }
}
class Politician extends Person{
    Politician(double income){
        super(income);
    }
    void cal1(){
        salary = income -500;
    }
}
class Sportsman extends Person{
    Sportsman(double income){
        super(income);
    }
    void cal2(){
        salary = salary - 5000;
    }
}
public class Inherits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter income of politcian: ");
        double sal1 = sc.nextDouble();
        System.out.println("enter income of sportsman: ");
        double sal2 = sc.nextDouble();
        Politician obj1 = new Politician(sal1);
        Sportsman obj2 = new Sportsman(sal2);
        obj1.cal1();
        obj2.cal2();
        obj1.display();
        obj2.display();
    }
}