package hackerrank;

public class BiggerIsGreater {

    public static String biggerIsGreater(String str){
        char[] arr = str.toCharArray();
        int j= arr.length-1;
        while(arr[j]<= arr[j-1] && j>0)
            j--;
        if(j<=0)
            return "no answer";

        int wl= arr.length-1;
        while (arr[j-1] >= arr[wl])
            wl--;
        char temp = arr[wl];
        arr[wl]= arr[j-1];
        arr[j-1]=temp;

        wl=arr.length-1;
        while(j<wl){
            temp = arr[j];
            arr[j]= arr[wl];
            arr[wl]=temp;
            j++;
            wl--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args){
        String str= "lmno";

        System.out.println("Bigger String: "+ biggerIsGreater(str));
    }
}
