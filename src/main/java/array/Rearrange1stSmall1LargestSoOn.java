package array;

import java.util.Arrays;

/*print an array in order - 1st smallest 1st largest, 2nd smallest 2nd largest and so on*/
public class Rearrange1stSmall1LargestSoOn {
    public static void main(String [] args){
        Integer [] arr= {5, 8, 1, 4, 2, 9, 3, 7, 6};
        Integer[] res = new Integer[arr.length];
        System.out.println("Original Array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        boolean isfirst= true;
        int p=0;
        int q= arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(isfirst) {
                res[i] = arr[p++];
                isfirst=false;
            }else{
                res[i] = arr[q--];
                isfirst=true;
            }
        }

        System.out.println("Rearranged Array: "+ Arrays.toString(res));
    }
}
