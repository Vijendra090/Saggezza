/* Rearrange an array in such way that arr[i]=i. Array contains ele in range from 0 to n-1,
* where n is length of array. All the ele not present in array, the ele not present -1 will be there*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RearrangeArray {
    public static Integer[] rearrangeArray1(Integer[] arr){
        Integer[] temp= new Integer[arr.length];

        for(int i=0;i<temp.length;i++){
            if( arr[i] != -1){
                temp[ arr[i] ]= arr[i];
            }
        }
        for(int i=0;i<temp.length;i++){
            if( temp[i] == null){
                temp[i]= -1;
            }
        }
        return temp;
    }

    public static Integer[] rearrangeArrayUsingHashSet(Integer[] arr){
        Set<Integer> hs = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(hs.contains(i)){
                arr[i]=i;
            }else{
                arr[i]=-1;
            }
        }
       return arr;
    }

    public static void main(String[] args){
        Integer[] arr= new Integer[]{1,-1,4,-1,2};  //Declaring array literal
        //Integer[] arr= new Integer[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        //Better way to print the primitive arrays
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Rearranged Array: "+Arrays.toString(rearrangeArray1(arr)));
        System.out.println("Rearranged Array: "+Arrays.toString(rearrangeArrayUsingHashSet(arr)));
    }
}
