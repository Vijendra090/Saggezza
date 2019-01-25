
/*Convert the array in such a way that if next valid number is same as current number,
  double its value and replace the next number with 0. After the modification, rearrange
  the array such that all 0’s are shifted to the end*/
import java.util.Arrays;

public class PushZerosToEnd {

    public static Integer[] pushZerosToEnd(Integer[] arr){
        int count=0;
        int temp;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0 && arr[i]== arr[i+1]){
                arr[i]= 2*arr[i];
                arr[i+1]= 0;
            }
        }
        //pushing all the ele at the end of array
        for(int i=0;i<arr.length; i++){
            if(arr[i]!=0) {
                temp = arr[count];
                arr[count++]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Integer[] arr= {2, 2, 0, 4, 0, 8};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Modified Array: "+Arrays.toString(pushZerosToEnd(arr)));
    }
}
