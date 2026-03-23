//reference parent, object child
class Animal{
    void sound(){
        System.out.println("animals cannot talk");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("basic stuff dogs bark");
    }
}
public class DynamicMethodDispatch{
    public static void main(String[] args){
        Animal obj = new Animal();
        obj.sound();
        obj =  new Dog();
        obj.sound();
    }
}
