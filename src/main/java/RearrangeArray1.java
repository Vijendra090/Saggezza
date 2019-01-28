/* Given an array of size n where all element are distinct and in the range of 0 to n-1
*  modify the array in such a way that arr[i]=j is changed to arr[j]=i*/

import java.util.Arrays;

public class RearrangeArray1 {  //can you solve this in time: O(n) and space: O(1)
    public static void main(String[] args){
        Integer[] arr={2, 0, 1, 4, 5, 3};
        Integer[] res= new Integer[arr.length];

        for(int i=0; i<arr.length; i++){
            res[ arr[i]]= i;
        }

        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Rearranged Array: "+ Arrays.toString(res));
    }
}
