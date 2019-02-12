package hackerrank;

public class FindDistinctPairSumEqualToK {

    public static int findDistinctPairSumEqualToK(int[] arr, int target){

        int i,j,k;
        int len=arr.length;
        for(i=0;i<len;i++)
            System.out.print(arr[i]+"->");
        for(i=0;i<len-1;i++){
            for (j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    for(k=j;k<len;k++){
                        if(k+1==len)
                            break;
                        else
                            arr[k]=arr[k+1];
                    }
                    len--;
                }
            }
        }
        System.out.println("");
        for(i=0;i<len;i++)
            System.out.print(arr[i]+"  ");
        return 0;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,1,8,9,5,10,1};
        int target=7;
        System.out.println(findDistinctPairSumEqualToK(arr, target));
    }
}
