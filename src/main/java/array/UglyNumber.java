package array;

import java.util.Arrays;

public class UglyNumber { //not correct

    public static void main(String[] args){
        int n=15;
        int un=1;
        int i=2;
        int k=1;
        while(k<=n){

            while(i%2!=0 && i%3!=0 && i%5!=0){
                i++;
            }
            un=i++;
            k++;
        }
        System.out.println(un);
    }

}
