/*Given two integer arrays of same size, “arr[]” and “index[]”,
  reorder elements in “arr[]” according to given index array */

import java.util.Arrays;

public class ReorderArray {

    public static void main(String[] args){
        Integer[] arr ={50, 40, 70, 60, 90};
        Integer[] index={3,  0,  4,  1,  2};
        Integer[] res = new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
            res[ index[i] ] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]= res[i];
            index[i]=i;
        }

        System.out.println("Ordered Array: "+ Arrays.toString(arr));    // [40, 60, 90, 50, 70]
        System.out.println("Ordered Index: "+ Arrays.toString(index));  // [0, 1, 2, 3, 4]
    }
}
