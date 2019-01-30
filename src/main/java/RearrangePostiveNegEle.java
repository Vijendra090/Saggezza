import java.util.Arrays;

/*Rearrange positive and neg ele of an array such that neg ele comes first and then
* positive ele without extra space. Order of ele must be preserved */
public class RearrangePostiveNegEle {
    //function right rotate the sub-array specified number of times
    public static Integer[] rotateArrayRight(Integer[] arr, int rotate,int start, int last){
        while(rotate-- > 0) {
            int temp = arr[last],i;
            for (i=last; i > start; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = temp;
        }
        return arr;
    }

    public static Integer[] rearrangeEle1stNeg2ndPos(Integer[] arr){

        int count=0;    // count: number of times we need to rotate the array
        int start;    // start: stores the start index of the sub array to rotate
        for(int i=0;i<arr.length;i++){

            while( i< arr.length && arr[i] < 0){
                i++;
                count++;
            }

            if(count>0){
                start=0;
                while(start < arr.length && arr[start]<0)
                    start++;
                arr= rotateArrayRight(arr,count,start,--i);
                count=0;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        //Integer[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        Integer[] arr = {-13, -5, -7, -3, -6};  //if all the ele negative the algo will take O(n2) time
        System.out.println("Original Array: "+Arrays.toString(arr)); //[12, 11, -13, -5, 6, -7, 5, -3, -6]
        System.out.println("Rearranged Array: "+ Arrays.toString(rearrangeEle1stNeg2ndPos(arr)));
        //[-13, -5, -7, -3, -6, 12, 11, 6, 5]
    }
}
