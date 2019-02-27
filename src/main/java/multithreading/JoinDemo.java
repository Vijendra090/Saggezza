package multithreading;

class MyThreadClass implements Runnable{

    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Thread Started -"+ thread.getName());
        try{
            thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread Ended -"+ thread.getName());
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThreadClass(), "th1");
        Thread th2 = new Thread(new MyThreadClass(), "th2");
        Thread th3 = new Thread(new MyThreadClass(), "th3");

        //start first thread immediately
        th1.start();
        //start second thread after completion of first thread
        try{
            System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
            th1.join();
            //System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
        try{
            System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
            th2.join();
            //System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th3.start();
        try{
            System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
            th3.join();
            //System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" is in state- "+ Thread.currentThread().getState());
        System.out.println("All the Threads are completed");
    }
}
