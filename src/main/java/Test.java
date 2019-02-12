public class Test{

<<<<<<< HEAD
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void detectAndRemoveLoop(){
        Node sp=null,fp=null;
        sp=fp=head;
        while(sp!=null && fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;

            if(sp==fp){  //loop found
                System.out.println("-->loop found");
                removeTheloop(sp);
            }
        }
    }

    public static void removeTheloop(Node loop){
        Node p1=null,p2=null;
        p1=p2=loop;
        //count the number of node involve in loop
        int k=1;
        while(p2.next != p1){
            k++;
            p2=p2.next;
        }

        //set the head
        p1=head;
        p2=head;
        //set the p2 to point kth node from head
        for(int i=0;i<k;i++){
            p2=p2.next;
        }

        while(p2!=p1){
            System.out.println("-->"+p2.data);
            p2=p2.next;
            p1=p1.next;
        }
        p2=p2.next;
        while(p2.next!=p1)
            p2=p2.next;

        p2.next=null;

    }

    public static void displayList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
=======
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
>>>>>>> 5e8e310a4ead9d83aecb02baac16dba173f248d7

        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);

        head= n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n2;

<<<<<<< HEAD
        detectAndRemoveLoop();
        displayList();
=======
        //hashset
        HashSet<Integer> hashSet= new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer>();

        //TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        //Queue interface
        Queue<Integer> queue = new LinkedList<Integer>();
        ((LinkedList<Integer>) queue).add(10);
        ((LinkedList<Integer>) queue).add(20);
        ((LinkedList<Integer>) queue).add(30);

        System.out.println("Queue: "+queue);
        System.out.println("Queue: "+queue.peek());

>>>>>>> 5e8e310a4ead9d83aecb02baac16dba173f248d7
    }
}
