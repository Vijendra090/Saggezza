import java.util.Arrays;

public class RearrangeArrayWithOrderPreserve {
    public static Integer[] rightRotateSubArray(Integer[] a, int i, int j){
        int tmp= a[j];
        int k;
        for(k=j;k>i;k--){
            a[k]=a[k-1];
        }
        a[i]=tmp;
        //System.out.println("->"+ Arrays.toString(a));
        return a;
    }

    public static void main(String[] args){
        //Integer[] arr = new Integer[]{1, 2, 3, -4, -1, 4};
        Integer[] arr = new Integer[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println("Original Array: "+ Arrays.toString(arr));

        int cur=0;
        for(int i=0; i< arr.length; i++){
            if( arr[i] < 0 && i%2!=0){  //neg ele, odd place (means out of place)
                cur=i+1;
                while(cur<arr.length && arr[cur]<0)
                    cur++;
                if(cur<arr.length)
                    arr = rightRotateSubArray(arr,i,cur);
            }

            if(arr[i] >= 0 && i%2==0 ){  //pos ele, even place (means out of place)
                cur=i+1;
                while(cur<arr.length && arr[cur]>=0)
                    cur++;
                if(cur<arr.length)
                    arr = rightRotateSubArray(arr,i,cur);
            }

        }
        System.out.println("Rearranged Array: "+ Arrays.toString(arr));
    }
}
