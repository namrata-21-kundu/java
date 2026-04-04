/*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:Books & Literature
One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.*/
import java.util.*;
class Book{
    String title, author;
    int price;
    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("\ntitle: "+title);
        System.out.println("author: "+ author);
        System.out.println("price: "+ price);
    }
}
public class ConsOverloading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book obj1 = new Book();
        obj1.display();
        System.out.println("\nenter title: ");
        String t1 = sc.nextLine();
        System.out.println("enter author: ");
        String a1 = sc.nextLine();
        Book obj2 = new Book(t1,a1);
        obj2.display();
        System.out.println("\nenter title: ");
        String t2 = sc.nextLine();
        System.out.println("enter author: ");
        String a2 = sc.nextLine();
        System.out.println("enter price: ");
        int p2 = sc.nextInt();
        Book obj3 = new Book(t2,a2,p2);
        obj3.display();
    }
}