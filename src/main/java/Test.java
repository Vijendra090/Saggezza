public class Test{

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

        detectAndRemoveLoop();
        displayList();
    }
}
