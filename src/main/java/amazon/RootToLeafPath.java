package amazon;

public class RootToLeafPath {

    public static void printArray(int[] a, int len){
        for(int i=0;i<len;i++){
            if(i<len-1)
                System.out.print(a[i]+"->");
            else
                System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void allRootToLeafPath(TreeNode root, int[] pathA, int pathLen ){
        if(root==null)
            return;
        pathA[pathLen]=root.data;
        pathLen++;
        if(root.left==null && root.right==null)
            printArray(pathA,pathLen);
        allRootToLeafPath(root.left,pathA,pathLen);
        allRootToLeafPath(root.right,pathA,pathLen);
    }

    public static void main(String[] args){
        TreeNode root=new TreeNode(26);
        root.left=new TreeNode(10);
        root.right=new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right=new TreeNode(6);
        root.right.right=new TreeNode(3);

        int[] path = new int[10];
        allRootToLeafPath(root,path,0);
    }
}
