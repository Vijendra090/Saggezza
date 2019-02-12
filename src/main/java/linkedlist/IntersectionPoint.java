package linkedlist;

public class IntersectionPoint {

    static Node head1=null, head2=null;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static int numberOfNodes(Node head){
        int numOfNode=0;
        while (head!=null){
            numOfNode++;
            head=head.next;
        }
        return numOfNode;
    }
    static void findIntersectionPoint(){
        int n1= numberOfNodes(head1);
        int n2= numberOfNodes(head2);
        Node p=head1;
        Node q=head2;
        if(n1>n2){
             while(n1 != n2){
                p=p.next;
                n1--;
             }
        }else{
            while(n1 != n2){
                q=q.next;
                n2--;
            }
        }
        while(p!=q){
            p=p.next;
            q=q.next;
        }

        System.out.println("Intersection point node data: "+p.data);
    }

    static void printList(Node head){
        Node tmp =head;
        while(tmp!=null){
            System.out.print(tmp.data+"-->");
            tmp=tmp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){

        head1= new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);
        head1.next.next.next.next=new Node(50);

        head2= new Node(90);
        head2.next= new Node(80);
        head2.next.next= new Node(70);
        head2.next.next.next= new Node(60);
        head2.next.next.next.next= head1.next;

        printList(head1);
        printList(head2);
        findIntersectionPoint();
    }
}
