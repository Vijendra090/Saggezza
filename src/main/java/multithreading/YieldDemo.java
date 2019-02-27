package multithreading;

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class YieldDemo {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i=0;i<5;i++) {
            //control passes to child thread
            Thread.yield();
            //after child thread main thread will takes over
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
}
