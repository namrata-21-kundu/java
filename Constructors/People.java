//Class Person inherits Politician and Sportsman
//Use constructors to calculate salary and display functions
import java.util.*;
class Person{
    int income;
    Person(int income){
        this.income = income;
    }
    void calcSalary(){
        System.out.println("Salary= " + (income - 500) );
    }
    void display(){
        System.out.println("Income = "+income);
    }
}
class Politician extends Person{
    Politician(int i){
        super(i);
    }
}
class Sportsman extends Person{
    Sportsman(int ii){
        super(ii);
    }
}
public class People {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter income of politician: ");
        int income1 = sc.nextInt();
        Politician p = new Politician(income1);
        p.calcSalary();
        p.display();
        System.out.println("enter income of sportsman: ");
        int income2 = sc.nextInt();
        Sportsman s = new Sportsman(income2);
        s.calcSalary();
        s.display();
    }
}
