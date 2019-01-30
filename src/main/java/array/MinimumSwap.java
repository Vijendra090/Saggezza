package array;/*Minimum swap required to bring ele less than or equal to given ele K in an array*/


import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwap {
    //using the partition algo of quicksort
    public static ArrayList<Object> minimumSwap(Integer[] arr, int pivot){
        int temp;
        int i=0;
        int j=arr.length-1;
        int swap=0;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        //loop will put all the element less than or equal to pivot on left and larger to right
        while (i<j){
            while(i< arr.length && arr[i]<=pivot)
                i++;
            while(j>=0 && arr[j]>pivot)
                j--;
            if(i<j){
                temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                swap++;
                i++;
                j--;
            }
        }
        arrayList.add(arr);
        arrayList.add(swap);
        return arrayList;
    }

    public static void main(String[] args){
        Integer [] arr= {2, 1, 5, 6, 3};    //Declaring Integer array literal

        int k=3;
        ArrayList<Object> result = minimumSwap(arr,k);
        System.out.println("Minimum Swap: "+ result.get(1));
        System.out.println("Modified Array: "+ Arrays.toString((Integer[])result.get(0)));

    }
}
