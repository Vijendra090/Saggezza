/*wave form: a[0]>=a[1]<=a[2]>=...*/
package array;

import java.util.Arrays;

public class WaveFormArray {

    //utility method to swap two number
    public static void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    //logic to sort an array into wave form
    public static int[] waveFormLiner(int[] a){
        int len=a.length;
        int tmp;
        for(int i=0;i<len;i=i+2){

            if(i>0 && a[i]<a[i-1]){
                    swap(a,i,i-1);
            }
            if(i<len-1 && a[i]<a[i+1]){
                    swap(a,i,i+1);
            }

        }
        return a;
    }

    public static void main(String[] args){

        int[] arr={10, 90, 49, 2, 1, 5, 23};
        int tmp;
        //Sort the array in ascending order
        System.out.println("Input array: "+Arrays.toString(arr));
        System.out.println("Wave form(O(n)): "+Arrays.toString(waveFormLiner(arr)));
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i=i+2){

            if(i+1<arr.length){
                swap(arr,i,i+1);
            }
        }

        System.out.println("Wave form(O(nlogn)): "+Arrays.toString(arr));

    }
}
