/* wap to demonstrate implementing runnable along with classinheritance and exceuting a child thread */

class Parent {
    void showParent() {
        System.out.println("Inside Parent class");
    }
}

// Extending Parent AND implementing Runnable
class MyTask extends Parent implements Runnable {
    public void run() {
        System.out.println("Child thread running");
    }
}

public class Test {
    public static void main(String[] args) {

        MyTask obj = new MyTask();

        obj.showParent();  // using Parent class method

        Thread t = new Thread(obj);  // passing Runnable
        t.start();  // starting thread
    }
}