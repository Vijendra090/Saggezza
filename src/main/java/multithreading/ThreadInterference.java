package multithreading;

//java program explaining the concept of thread interference
//creating thread by creating the object of SharedClass
class SharedClass{
    int i=10;

    public void increment(){
        i++;
        System.out.println(i);
    }
    public void decrement(){
        i--;
        System.out.println(i);
    }
}

public class ThreadInterference {
    public static void main(String[] args){
        SharedClass thread1 = new SharedClass();
        SharedClass thread2 = new SharedClass();
        thread1.increment();
        thread2.decrement();
    }

}
