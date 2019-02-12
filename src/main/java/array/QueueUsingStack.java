package array;

import java.util.Stack;

public class QueueUsingStack {

    static class MyQueue{

        private Stack<Integer> s1 = new Stack<Integer>();
        private Stack<Integer> s2 = new Stack<Integer>();

        void enqueue(int ele){
            s1.push(ele);
        }

        int dequeue(){
            if(s2.isEmpty()==true){
                if(s1.isEmpty()==true){
                    return -1;
                }
                else {
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                    return s2.pop();
                }
            }else {
                return s2.pop();
            }
        }

    }

    public static void main(String[] args){
        MyQueue myQueue= new MyQueue();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);


        //int ele= myQueue.dequeue();
        System.out.println("Removed ele: "+ myQueue.dequeue());
        System.out.println("Removed ele: "+myQueue.dequeue());
        System.out.println("Removed ele: "+myQueue.dequeue());
        System.out.println("Removed ele: "+myQueue.dequeue());
    }
}
