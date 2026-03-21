/*
implement multilvelel inheritance having parameterised base class constructor present in each class
*/
class Animal{
    String name;
    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor called--" );
    }
}
class Dog extends Animal{
    int age;
    Dog(String name, int age){
        super(name);
        this.age = age;
        System.out.println("Dog called--" );
    }
}
class Lab extends Dog{
    int weight;
    Lab(String name, int age, int weight){
        super(name, age);
        this.weight = weight;
        System.out.println("Lab called" + name + age + weight);
    }
}
public class multi_level_inheritance {
    public static void main(String[] args){
        Lab obj = new Lab("Honey", 4, 23);
    }
}
