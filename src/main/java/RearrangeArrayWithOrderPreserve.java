import java.util.Arrays;

public class RearrangeArrayWithOrderPreserve {
    public static Integer[] rightRotateSubArray(Integer[] a, int i, int j){
        int tmp= a[j];
        int k;
        for(k=j;k>i;k--){
            a[k]=a[k-1];
        }
        a[i]=tmp;
        return a;
    }

    public static void main(String[] args){
        Integer[] arr = new Integer[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        int j=0;
        for(int i=0; i< arr.length; i++){
            if( arr[i] < 0 && i%2!=0){  //neg ele, odd place (out of place)
                j=i+1;
                while(j<arr.length && arr[j]<0)
                    j++;
            }
            else{
                if(arr[i] > 0 && i%2==0 ){  //pos ele, even place
                    j=i+1;
                    while(j<arr.length && arr[j]>0)
                        j++;
                }
            }
            if(j<arr.length)
                arr = rightRotateSubArray(arr,i,j);
        }
        System.out.println("Rearranged Array: "+ Arrays.toString(arr));
    }
}
