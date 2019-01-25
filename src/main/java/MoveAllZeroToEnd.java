import java.util.Arrays;

public class MoveAllZeroToEnd {

    //Moving all element end of array without any array rotations
    public static Integer[] moveAllZeroAtEnd(Integer[] arr){
        int count=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0)
                arr[count++]=arr[i];
        }
        while (count<arr.length)
            arr[count++]=0;
        return arr;
    }

    //Moving all the Zeros at end of array using Array Rotations
    public static Integer[] moveAllZeroAtEndOfArray(Integer[] arr){
        int cur;
        for(int i=0;i<arr.length;i++){
            while(i<arr.length && arr[i]>0) // find the first zero ele
                i++;
            cur=i+1;
            while(cur<arr.length && arr[cur]==0)    // find the next non-zero ele
                cur++;
            if(cur< arr.length)
                arr=RearrangeArrayWithOrderPreserve.rightRotateSubArray(arr,i,cur); // rotating the subarray
        }
        return arr;
    }
    public static void main(String[] args){
        Integer[] arr= new Integer[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};  //Declaring array literal

        System.out.println("Original Array: "+ Arrays.toString(arr));
        System.out.println("Rearranged Array: "+ Arrays.toString(moveAllZeroAtEndOfArray(arr)));
        System.out.println("Rearranged Array: "+ Arrays.toString(moveAllZeroAtEnd(arr)));
    }
}
