import java.util.Arrays;

public class ConvertArrayToMagicSquare {    //not correct code

    public static void convertArrayToMagicSquare(int[][] arr){
        int row=-1;
        int col=-1;
        int minCost=0;
        for( int i=0 ; i <arr[0].length;i++){
            for( int j=0 ;j <arr[0].length;j++ ){
                if(arr[i][j]==1){
                    row=i;
                    col=j;
                }
                break;
            }
            if(row!=-1 && col!=-1)
                break;
        }
        System.out.println("row= "+row+"    col= "+col);
        for(int num=1;num<=arr[0].length*arr[0].length;) {
            if (row == -1 && col == arr[0].length) {  //3rd condition
                row = 0;
                col = arr[0].length - 2;
            } else {
                //1st condition
                if (row < 0)
                    row = arr[0].length - 1;
                if (col == arr[0].length)
                    col = 0;
            }
            //2nd condition
            if(arr[row][col] != 0){
                if(arr[row][col] != num){
                    minCost+= Math.abs(arr[row][col]-num);
                    arr[row][col]=num++;
                }
                //row=row+1;
                //col=col-2;
                //continue;
            }
            row--;
            col++;
        }
        System.out.println("Minimum Cost: "+ minCost)   ;
        for(int i=0;i<arr[0].length;i++)
            System.out.println(Arrays.toString(arr[i]));
    }
    public static void main(String[] args){
        int[][] arr = new int[][]{{5,3,4},{1,5,8},{6,4,2}};
        for(int i=0;i<arr[0].length;i++)
            System.out.println(Arrays.toString(arr[i]));
        convertArrayToMagicSquare(arr);
    }
}
