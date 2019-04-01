package amazon;

import java.util.Arrays;

//Given an array of distinct elements and a number x, find if there is a pair with a product equal to x.
public class PairWithGivenProduct {

    public static void main(String[] args){
        int x=400;
        int[] arr={10,20,9,40};
        Arrays.sort(arr);

        int flag=0;
        int s=0;
        int e= arr.length-1;
        while(s<e){
            if( arr[s]*arr[e] == x){
                flag=1;
                break;
            }
            else{
                if(arr[s]*arr[e] < x)
                    s++;
                else
                    e--;
            }
        }
        if(flag==1)
            System.out.println("yes Product exist!!");
        else
            System.out.println("No");
    }
}
