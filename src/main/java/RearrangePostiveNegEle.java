import java.util.Arrays;

/*Rearrange positive and neg ele of an array such that neg ele comes first and then
* positive ele. Order of ele must be preserved */
public class RearrangePostiveNegEle {   //Order not preserved need to check

    public static Integer[] rearrangeEle1stNeg2ndPos(Integer[] arr){
        int count=0;
        int temp;
        for (int i=0; i< arr.length; i++){
            if(arr[i]<0) {
                temp=arr[i];
                arr[i]=arr[count];
                arr[count++]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Integer[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Original Array: "+Arrays.toString(arr)); //[12, 11, -13, -5, 6, -7, 5, -3, -6]
        System.out.println("Rearranged Array: "+ Arrays.toString(rearrangeEle1stNeg2ndPos(arr)));
        //[-13, -5, -7, -3, -6, 12, 5, 11, 6]
    }
}
