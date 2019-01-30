package array;

import java.util.Arrays;

/*Rearrange ele in such way that A[i] <= A[i-1] if i is odd */
public class RearrangeEvenOddPosEle {
    public static void main(String [] args){
       Integer[] arr= {1,3,2,2,5};

        Arrays.sort(arr);
        Integer[] res= new Integer[arr.length];
        int p=0;
        int q=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0 )
                res[i]=arr[q--];
            else
                res[i]=arr[p++];
        }
        System.out.println("Rearranged Array: "+ Arrays.toString(res));
    }
}
