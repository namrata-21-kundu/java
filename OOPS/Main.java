// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void breathe() {
        System.out.println("Animal breathes");
    }
}

// Level 2
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Level 3
class Labrador extends Dog {
    @Override
    void sound() {
        System.out.println("Labrador barks loudly");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

       /*  // Parent reference, different object types
        Animal a;

        a = new Animal();
        a.sound();       // Animal makes a sound

        a = new Dog();
        a.sound();       // Dog barks        ← resolved at runtime

        a = new Labrador();
        a.sound();       // Labrador barks loudly  ← resolved at runtime

        a = new Cat();
        a.sound();       // Cat meows        ← resolved at runtime

        System.out.println("---");

        // Non-overridden method — uses Animal's version for all
        a = new Dog();
        a.breathe();     // Animal breathes  ← inherited, not overridden
        */
        System.out.println("---");

        // Array of Animal references — classic polymorphism
        Animal[] animals = { new Animal(), new Dog(), new Labrador(), new Cat() };

        for (Animal animal : animals) {
            animal.sound();   // correct version called for each object
        }
    }
}


/*
**Output:**
```
Animal makes a sound
Dog barks
Labrador barks loudly
Cat meows
---
Animal breathes
---
Animal makes a sound
Dog barks
Labrador barks loudly
Cat meows
```

---
 
### How It Works Internally

At compile time, the compiler only checks that `sound()` exists in `Animal` (the reference type). It does **not** decide which version to call. At runtime, the JVM looks at the **actual object** sitting in memory and calls that object's version of `sound()`. This lookup happens via a **vtable** (virtual method table) maintained per class.
```
Animal a = new Dog();
   │               │
   │               └── actual object in heap → Dog's vtable → Dog.sound()
   └── reference type → compiler just checks method exists in Animal

*/