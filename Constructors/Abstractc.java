//Abstract class employee having properties and abstract functions for calculating net salary and display info
//Drive manager and clerk class froma abstract class 
//override dsiplay method

import java.util.*;
abstract class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    abstract int netSalary();
    void display(){
        int netsal = netSalary();
        System.out.println(name + " earns " + netsal);
    }
}
class Manager extends Employee{
    Manager(String name1, int sal1){
        super(name1, sal1);
    }
    int netSalary(){
        return (salary + 500) ;
    }
}
class Clerk extends Employee{
    Clerk(String name2, int sal2){
        super(name2, sal2);
    }
    int netSalary(){
        return (salary + 200) ;
    }
}
public class Abstractc {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("\n--manager--");
    System.out.println("Enter name: ");
    String n1 = sc.nextLine();
    System.out.println("Enter salary: ");
    int s1 = sc.nextInt();
    Manager m = new Manager(n1, s1);
    m.display();
    sc.nextLine();
    System.out.println("\n--clerk--");
    System.out.println("Enter name: ");
    String n2 = sc.nextLine();
    System.out.println("Enter salary: ");
    int s2 = sc.nextInt();
    Clerk c = new Clerk(n2, s2);
    c.display();
    }
}