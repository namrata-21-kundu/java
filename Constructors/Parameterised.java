//Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.
class Dog{
    String name, color;
    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }
}
public class Parameterised{
    public static void main(String[] args){
        Dog obj = new Dog("Lab", "black");
        System.out.println("name of dog: " + obj.name);
        System.out.println("color of dog: "+ obj.color);
    }
}