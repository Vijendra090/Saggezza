package amazon;

public class NearestSmaller {

    public static String printNearestSmaller(int[] arr, int len){
        String res="_,";
        int nearestSmaller=arr[0];

        for(int i=1;i<len;i++){
            if(arr[i-1] < arr[i]){
                res=res+ arr[i-1];
                if(nearestSmaller>arr[i])
                    nearestSmaller=arr[i];
            }
            else {
                if(nearestSmaller<arr[i])
                    res=res+nearestSmaller;
                else
                    res=res+"_";
            }
            if(i+1<len)
                res=res+",";
        }
        return res;
    }

    public static void main(String [] args){
        //int[] arr= {1, 3, 0, 2, 5};
        int[] arr={1, 6, 4, 10, 2, 5};
        String res=printNearestSmaller(arr, arr.length);
        System.out.println(res);
    }
}
