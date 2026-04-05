/*
Question: Multilevel Inheritance (Student → Exam → Result)
Write a Java program using multilevel inheritance:
Class Student → contains name and roll
Class Exam (derived from Student) → contains marks1, marks2
Class Result (derived from Exam) → calculate total and percentage
Display all details
*/
import java.util.*;
class Student{
    String name;
    int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}
class Exam extends Student{
    int marks1, marks2;
    Exam(String name, int rollNo, int marks1, int marks2){
        super(name,rollNo);
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
}
class Result extends Exam{
    int total;
    double percentage;
    Result(String name, int rollNo, int marks1, int marks2){
        super(name, rollNo, marks1, marks2);
    }
    void display(){
        total = marks1 + marks2;
        percentage = total / 2;
        System.out.println(name + " got " + total + " with " + percentage + "%");
    }
}
public class Stud_MultiLevel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String nm = sc.nextLine();
        System.out.println("enter roll no: ");
        int rno = sc.nextInt();
        System.out.println("enter marks of subject 1: ");
        int m1 = sc.nextInt();
        System.out.println("enter marks of subject 2: ");
        int m2 = sc.nextInt();
        Result r = new Result(nm, rno, m1, m2);
        r.display();
    }
}
