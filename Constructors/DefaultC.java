//Write a Java program to create a class called “Cat” with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
class Cat{
        private String name;
        private int age;
        public Cat(){
            this.name = "Unknown";
            this.age = 0;
        }
        public String getterName(){
            return name;
        }
        public int getterAge(){
            return age;
        }
}
public class DefaultC {
    public static void main(String[] args){
        Cat obj = new Cat();
        System.out.println("name: "+ obj.getterName());
        System.out.println("age: "+ obj.getterAge());
    }
}
