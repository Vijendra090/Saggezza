package array;

import java.util.Arrays;

/*Magic square is a square matrix of nxn. contains distinct ele from 1 to n^2.
* Such that all rows, all column and both diagonal sum will be same constant.
* first ele pos is (i,j) where i=n/2 and j= n-1
* Need to check 3 conditions:
* 1: the pos of next ele is calculated as (i-1,j+1) and if i=-1 it will wrap around n-1 or if j=n it will wrap around to 0
* 2: if magic[i][j] contains an ele at the calculated pos(i,j), then new pos will be(i+1,j-2)
* 3: if calculated row pos is -1 and col pos is n, then new pos will be (0,n-2)*/

public class MagicSquare {

    public static void generateMagicSquare(int n){
        //pos for first number
        int[][] magicSquare= new int[n][n];
        int row= n/2;
        int col= n-1;

        for(int num=1;num<=n*n;) {
            if (row == -1 && col == n) {  //3rd condition
                row = 0;
                col = n - 2;
            } else {
                //1st condition
                if (row < 0)
                    row = n - 1;
                if (col == n)
                    col = 0;
            }
            //2nd condition
            if(magicSquare[row][col] != 0){
                row=row+1;
                col=col-2;
                continue;
            }
            else
                magicSquare[row][col]=num++;
            row--;
            col++;
        }
        for(int i=0;i<n;i++)
            System.out.println(Arrays.toString(magicSquare[i]));
    }

    public static void main(String[] args){
        //works only n is odd
        int n=3;
        generateMagicSquare(n);
    }
}
