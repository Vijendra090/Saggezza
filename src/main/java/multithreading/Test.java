package multithreading;

public class Test extends Thread {

    public void run(){
        System.out.println("Current thread Name: "+Thread.currentThread().getName());
        System.out.println("Current thread Priority: "+Thread.currentThread().getPriority());
        System.out.println("Current thread State: "+Thread.currentThread().getState());
        System.out.println("Current thread Classloader: "+Thread.currentThread().getContextClassLoader());
        System.out.println("Current thread Id: "+Thread.currentThread().getId());
        System.out.println("Current thread Group: "+Thread.currentThread().getThreadGroup());
    }
    public static void main(String[] args) throws Exception{
        Test thread = new Test();
        thread.start();
        thread.join();
        thread.run();
    }

}
