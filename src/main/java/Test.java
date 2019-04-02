
class GenNode <T>{
    T data;
    GenNode next;

    GenNode(T data){
        this.data= data;
        next=null;
    }
}

public class Test{
    public static void main(String[] args){
        GenNode head;
        GenNode temp;
        head= new GenNode(10);
        head.next= new GenNode('w');
        head.next.next=new GenNode('r');
        head.next.next.next=new GenNode(30);

        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}