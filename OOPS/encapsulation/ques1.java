/*Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables. */
package encapsulation;
import java.util.Scanner;
class Person{
    private String name;
    private int age;
    private String country;
    
    public String getName(){
        return name;        //runs the variable value and returns the variable value
    }
    public void setName(String name){   //set method takes a parameter assigns it to the variable. "this" keyword is used to refer to the current object 
        this.name = name;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public int getAge(){
        return age;
    } 
    public void setAge(int age){
        this.age= age;
    }
}

public class ques1{     //main class
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ageOfPerson;
        String nameOfPerson, countryOfPerson;

        Person p1 = new Person();       //creating an instance of Person class

        System.out.print("Enter name: ");
        nameOfPerson = sc.nextLine();
        p1.setName(nameOfPerson);

        System.out.print("Enter age: ");
        ageOfPerson = sc.nextInt();
        p1.setAge(ageOfPerson);
        sc.nextLine();

        System.out.print("Enter country: ");
        countryOfPerson = sc.nextLine();
        p1.setCountry(countryOfPerson);
        
        System.out.println(p1.getName() + " of age " + p1.getAge() + " lives in " + p1.getCountry() );

        sc.close();
    }
}
    