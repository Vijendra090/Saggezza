package recursion;
/*Given a stack s, the task is to print the elements of the stack from bottom to top, such that the
  elements are still present in the stack without their order being changed in the stack.*/

import java.util.Stack;

public class PrintStackElement {

    static void printStackBottomToTop(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        else {
            int topEle= stack.pop();
            printStackBottomToTop(stack);
            System.out.println(topEle);
            stack.push(topEle);

        }
    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        System.out.println(stack);

        printStackBottomToTop(stack);
        System.out.println(stack);
    }
}
