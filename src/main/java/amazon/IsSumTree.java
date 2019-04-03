package amazon;

public class IsSumTree {
    static TreeNode root;
    static int sumNode(TreeNode node){
        if(node==null)
            return 0;
        return sumNode(node.left)+node.data+ sumNode(node.right);
    }

    static int isSumTree(TreeNode root){
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
        root=new TreeNode(26);
        root.left=new TreeNode(10);
        root.right=new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right=new TreeNode(6);
        root.right.right=new TreeNode(3);

        if(isSumTree(root)==1)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
