package recursion;

/*Delete node which have a greater value on right side using recursion
* example: 12->15->10->11->5->6->2->3->NULL should be changed to 15->11->6->3->NULL
* example: 10->20->30->40->50->60->NULL should be changed to 60->NULL
* example: 60->50->40->30->20->10->NULL should not be changed */
public class DeleteNodes {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node deleteNodes(Node head){
        if(head==null)
            return head;
        else{
            Node right= deleteNodes(head.next);
            if(right==null)
                return head;
            else{
                if(right.data>head.data){
                    head.data=right.data;
                    head.next=right.next;
                }
                return head;
            }
        }
    }

    public static void main(String[] args){
        //creating the input linked list
        head= new Node(60);
        head.next= new Node(50);
        head.next.next= new Node(40);
        head.next.next.next= new Node(30);
        head.next.next.next.next= new Node(20);
        head.next.next.next.next.next= new Node(10);
        //head.next.next.next.next.next.next= new Node(2);
        //head.next.next.next.next.next.next.next= new Node(3);

        Node head1 = deleteNodes(head);
        while(head1!=null){
            System.out.print(head1.data+"--->");
            head1=head1.next;
        }
    }
}

