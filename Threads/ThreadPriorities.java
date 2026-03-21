//Threads created by extending Thread class (Thread class is a part of java.lang package)  

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    //run() should be overriden in the class being defined for the thread -> perform action for a thread
    public void run(){
        System.out.println(Thread.currentThread() + " running with priority "
    + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorities {
    public static void main(String[] args){
        //creating thread objects
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        //setting thread priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY); //default priority of a thread = 5

        System.out.println(t1.getName() + " created with priority " +t1.getPriority());
        System.out.println(t2.getName() + " created with priority " + t2.getPriority());
        System.out.println(t3.getName() + " created with priority " + t3.getPriority());

        //starts threads
        t1.start();
        t2.start();
        t3.start();
    }
}
