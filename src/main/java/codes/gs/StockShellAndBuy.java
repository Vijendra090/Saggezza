package codes.gs;

import java.util.Scanner;

public class StockShellAndBuy {
    public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        int[] arr;
        int n,i,si,flag;
        while(t>0){
            flag=0;
            n= s.nextInt();
            arr= new int[n];
            for(i=0;i<n;i++){
                arr[i]= s.nextInt();
            }

            for(i=0;i<n;i++){
                si=i;
                while(i<n-1 && arr[i]<arr[i+1]){
                    i++;
                }
                if(si!=i){
                    flag=1;
                    System.out.print("("+si+" "+i+")"+" ");
                }
            }
            if(flag==0)
                System.out.print("No Profit");
            System.out.println();
            t--;
        }
    }
}
