package array;

public class PascalTriangle {

    static int pascal(int i, int j) {   //Using Recursion
        if (j == 0 || j==i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }

    public static void printPascalTriangle(int n){  //Non Recursion
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j]=1;
                }else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] arg){
        int n=4;
        printPascalTriangle(n);
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(pascal(i,j)+" ");
            }
            System.out.println();
        }
    }
}
