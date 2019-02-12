package tree;

public class SerachElementInBinaryTree {

    static Utility.BTNode root;

    static boolean searchEleInBTree(Utility.BTNode root, int ele){
        if(root!=null){
            if(root.data==ele)
                return true;
            return (searchEleInBTree(root.left,ele) || searchEleInBTree(root.right,ele));
        }
        return false;
    }
    public static void main(String[] args){
        root= new Utility.BTNode(1);
        root.left=new Utility.BTNode(2);
        root.right=new Utility.BTNode(3);

        if(searchEleInBTree(root,7)){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
    }
}
