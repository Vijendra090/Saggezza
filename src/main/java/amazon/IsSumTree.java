package amazon;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class IsSumTree {
    static Node root;
    static int sumNode(Node node){
        if(node==null)
            return 0;
        return sumNode(node.left)+node.data+ sumNode(node.right);
    }

    static int isSumTree(Node root){
        int ls,rs;
        if(root==null || (root.left==null && root.right==null))
            return 1;
        ls=sumNode(root.left);
        rs=sumNode(root.right);
        if(root.data== ls+rs && isSumTree(root.left)!=0 && isSumTree(root.right)!=0)
            return 1;
        return 0;
    }
    public static void main(String[] args){
        root=new Node(26);
        root.left=new Node(10);
        root.right=new Node(3);
        root.left.left= new Node(4);
        root.left.right=new Node(6);
        root.right.right=new Node(3);

        if(isSumTree(root)==1)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
