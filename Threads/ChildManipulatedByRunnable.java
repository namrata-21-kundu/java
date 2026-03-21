//not extending thread but extending Runnable task and running them as seperate threads -> child1 is just work to be done, it is not a thread
/*Program creates two child threads using Runnable interface.
Child1 and Child2 provide tasks, while Thread t1 and Thread t2 execute them concurrently with the main thread. */

class Child1 implements Runnable{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println("Child Thread 1 Running: "+ i);
        }
    }
}
//another child class
class Child2 extends Child1{
    public void run(){
        for(int i =0; i<5; i++){
            System.out.println("Child Thread 2 Running: "+ i);
        }
    }
}
public class ChildManipulatedByRunnable {
    //main thread
    public static void main(String[] args){
        Child1 kid1 = new Child1();    //create a runnable object
        Thread t1 = new Thread(kid1);   //create thread

        Child2 kid2 = new Child2();
        Thread t2 = new Thread(kid2);

        t1.start();
        t2.start();

        for(int i =0 ; i<5; i++){
            System.out.println("Main Thread Running: " + i);
        }
    }
}
