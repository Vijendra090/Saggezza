package array;

import java.util.Arrays;

public class QuickSort {

    static int partition(int a[], int i, int j) {
        int pivot= a[i];
        int p=i+1;
        int q=j;
        int tmp;
        while( p<q ) {
            while(a[p]<pivot) {
                p++;
            }
            while(a[q]>pivot) {
                q--;
            }
            if(p<q) {
                tmp=a[p];
                a[p]=a[q];
                a[q]=tmp;
            }
        }
        a[i]=a[q];
        a[q]=pivot;
        return q;
    }

    static void quickSort(int[] a, int i,int j){

        if(i<j) {
            int m = partition(a, i, j);
            quickSort(a,i,m-1);
            quickSort(a,m+1,j);
        }
        //return a;
    }

    public static void main(String[] arg){
        int[] arr= {38, 27, 43, 3, 9, 82, 10};
        quickSort(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(quickSort(arr,0,arr.length-1)));
        System.out.println(Arrays.toString(arr));
    }
}
