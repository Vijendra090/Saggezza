package array;

public class LargestSumContigiousSubArray {

    public static void largestSumContigiousSubArray_2(int[] arr){
        int curr_max=0;
        int next_max=0;

        for(int i=0; i< arr.length;i++){
            for(int j=i;j<arr.length; j++){
                next_max+=arr[j];
                if(next_max>curr_max)
                    curr_max=next_max;
            }
            next_max=0;
        }
        System.out.println("Maximum sum: "+curr_max);
    }
    public static void largestSumContigiousSubArray_1(int[] arr){   //Kadane's Algorithm
        int max_end_here=0;
        int max_so_far=0;
        //int startIndex=0;
        //int endIndex=0;
        for(int i=0;i<arr.length;i++){
            max_end_here+=arr[i];
            if(max_end_here<0) {
                max_end_here = 0;
            }
            if(max_so_far<max_end_here) {
                max_so_far = max_end_here;
            }
        }
        System.out.println("Maximum sum: "+max_so_far);
        //System.out.println("Start index: "+startIndex+" endIndex: "+endIndex);
    }
    public static void main(String[] args){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        //int[] arr={-2 ,-3 ,-1 ,-4 ,-6};
        largestSumContigiousSubArray_1(arr);
        largestSumContigiousSubArray_2(arr);
    }
}
