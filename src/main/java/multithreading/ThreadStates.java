package multithreading;

class ThreadA implements Runnable{

    public void run(){
        //ThreadB is created and currently is in new state
        Thread thread2 = new Thread(new ThreadB(), "ThreadB");
        System.out.println("State of threadB: "+thread2.getState());

        //starting the ThreadB
        thread2.start();
        System.out.println("State of threadB: "+thread2.getState());

        //moving the threadA in timed waiting state
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of ThreadB after calling sleep() on it: "+ thread2.getState());

        try{
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of threadB when it has finished it's execution - " +
                thread2.getState());
    }
}

class ThreadB implements Runnable{
    public void run(){
        System.out.println("Current Thread Name: "+Thread.currentThread().getName());

        //moving threadB in waiting state
        try{
            Thread.sleep(1500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("State of "+ ThreadStates.thread1.getName() +" while it called join method on "+ Thread.currentThread().getName()+"- "+ ThreadStates.thread1.getState());
        try{
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class ThreadStates {
    public static Thread thread1;
    public static void main(String[] args){
        thread1= new Thread(new ThreadA(), "ThreadA");
        //threadA is created and currently is in new state
        System.out.println("State of threadA :"+thread1.getState());
        thread1.start();

        //threadA is now in Runnable state
        System.out.println("State of threadA :"+thread1.getState());
    }
}
