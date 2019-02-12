package array;

import java.util.Arrays;

public class MergeSort {

    static int[] merge(int a[], int i, int m, int j){
        int[] b= new int[j-i+1];
        int k=m+1;
        int p=0;
        int s=i;
        while (i<=m && k<=j){
            if(a[i]<a[k]){
                b[p++]=a[i++];
            }
            else {
                b[p++]=a[k++];
            }
        }
        while (i<=m){
            b[p++]=a[i++];
        }
        while (k<=j){
            b[p++]=a[k++];
        }
        while (j>=s){
            a[j--]=b[--p];
        }
        return a;
    }

    static int[] mergeSort(int[] arr, int i, int j){
        int mid;
        if(i<j){
            mid=(i+j)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);
            merge(arr,i,mid,j);
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr= {38, 27, 43, 3, 9, 82, 10};
        int i=0;
        int j=arr.length-1;
        System.out.println(Arrays.toString(mergeSort(arr,i,j)));
    }
}
