
import java.util.*;

public class Test {
    public static void main(String[] args){

        //array list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        //linked list
        LinkedList<Integer> linkedList = new LinkedList<Integer>(list);
        linkedList.addFirst(20);
        System.out.println(linkedList);

        //hashset
        HashSet<Integer> hashSet= new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer>();
    }
}
