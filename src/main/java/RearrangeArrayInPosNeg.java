/*Rearrange given array in such way that neg and pos comes in alternate order*/

import java.util.Arrays;

public class RearrangeArrayInPosNeg {

    public static Integer[] rearrangeArrayInPosNeg(Integer[] arr){
        //Sort the array first using partition algo in O(n) time, pivot =0
        int i=-1,j,temp;
        for(j=0;j<arr.length;j++){

            if(arr[j] < 0){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int neg=0, pos=i+1;
        while(neg < pos && pos < arr.length && arr[neg] < 0 ){
            temp=arr[neg];
            arr[neg]=arr[pos];
            arr[pos]=temp;
            neg+=2;
            pos++;
        }
        return arr;
    }

    public static void main(String[] args){
        Integer[] arr= new Integer[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        Integer[] result= rearrangeArrayInPosNeg(arr);
        System.out.println("Rearranged Array: "+ Arrays.toString(result));
    }
}
