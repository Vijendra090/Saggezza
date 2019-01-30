package hackerrank;/*Given an integer array with distinct integer and positive integer k, count all
* the distinct pair whose diff equal to k*/
import java.util.Arrays;

public class CountPairsWithDiffK {

    public static int binarySearch(int[] a, int start, int end, int search){
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if(a[mid]==search)
                return mid;
            if(search < a[mid])
                end=mid-1;
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int countPairsWithDiffK_1(int k, int[] arr){    // O(nlogn)

        Arrays.sort(arr);   // Arrays.sort() used to sort the primitive type array
        int res;
        int count=0;
        for(int i=0; i< arr.length; i++){
            res= binarySearch(arr,i+1,arr.length-1, arr[i]+k);
            if(res>=0)
                count++;
        }

        return count;
    }

    public static int countPairsWithDiffK_2(int k, int[] arr){
        Arrays.sort(arr);
        int l=0,r=0;
        int diff;
        int count=0;
        while(l< arr.length && r<arr.length){
            diff=arr[r]- arr[l];
            if(diff == k){
                count++;
                l++;
                r++;
            }
            if(diff>k)
                l++;
            if(diff<k)
                r++;
        }
        return count;
    }

    public static void main(String[] args){

        int k=2;
        int[] arr= {1, 5, 3, 4, 2};

        System.out.println("Count: "+ countPairsWithDiffK_1(k, arr));
        System.out.println("Count: "+ countPairsWithDiffK_2(k, arr));

    }
}
