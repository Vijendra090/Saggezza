import java.util.ArrayList;

public class NonDivisibleSubset {   // not complete code

    public static int getCountForNonDivisibleSubset(int k, int[] arr){

        ArrayList<Integer> subSet = new ArrayList<Integer>();
//        int startIndex=-1;
//        for(int i=0;i<arr.length;i++){
//            if( arr[i]%k !=0){
//                startIndex=i;
//                subSet.add(arr[i]);
//                break;
//            }
//        }
        subSet.add(0);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<subSet.size();j++){
//                if(i== startIndex)
//                    break;
                if((subSet.get(j)+arr[i])%k == 0)
                    break;
                else
                    subSet.add(arr[i]);
            }
        }
        return subSet.size();
    }

    public static void main(String[] args){

        int[] arr={19,10,12,10,24,25, 22};
        int k=4;
        System.out.println("Possible size of subset: "+ getCountForNonDivisibleSubset(k,arr));
    }
}
