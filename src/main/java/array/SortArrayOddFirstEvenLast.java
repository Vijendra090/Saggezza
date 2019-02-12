package array;

import java.util.Arrays;

public class SortArrayOddFirstEvenLast {

    public static void sortArrayOddFirstEvenLastWithOrder(int[] arr){
        int i;
        int oddele=0,flag,tmp,k;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==1)
                oddele++;
        }
        i=0;
        while(i<oddele) {
            flag=0;
            if(arr[i] % 2 == 0) {//when a[i] is even
                flag=1;
                tmp=arr[i];
                k=i;
                while(k<arr.length-1){
                    arr[k]=arr[k+1];
                    k++;
                }
                arr[k]=tmp;
            }
            if(flag!=1) {
                i++;
            }
        }
        System.out.println("After moving odd and even: "+Arrays.toString(arr));//[1, 5, 7, 343, 13, 15, 17, 4, 2, 8, 22, 12, 122, 14]
        Arrays.sort(arr,0,oddele);
        Arrays.sort(arr,oddele,arr.length);
        System.out.println("After sorting odd and even: "+Arrays.toString(arr));//[1, 5, 7, 13, 15, 17, 343, 2, 4, 8, 12, 14, 22, 122]
    }

    public static void sortArrayOddFirstEvenLastWithOutOrder(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int tmp;
        while(i<j) {    //without order

            while( i<arr.length && arr[i]%2 !=0 ) //if i is looking for even ele
                i++;
            while( j>=0 && arr[j]%2==0 ) //if j is looking for odd ele
                j--;
            tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }
        System.out.println("i= "+i + "  j: "+j);
        System.out.println("After moving odd and even: "+Arrays.toString(arr));//[1, 17, 5, 15, 7, 13, 343, 8, 22, 12, 122, 14, 2, 4]
        Arrays.sort(arr,0,i);
        Arrays.sort(arr,i+1,arr.length);
        System.out.println("After sorting odd and even: "+Arrays.toString(arr));//[1, 5, 7, 13, 15, 17, 343, 2, 4, 8, 12, 14, 22, 122]
    }
    public static void main(String[] args){
        int arr[] ={1,4,5,2,7,8,343,13,22,12,122,14,15,17};
        System.out.println("Input Array: "+Arrays.toString(arr));
        sortArrayOddFirstEvenLastWithOrder(arr);
        sortArrayOddFirstEvenLastWithOutOrder(arr);
    }
}
