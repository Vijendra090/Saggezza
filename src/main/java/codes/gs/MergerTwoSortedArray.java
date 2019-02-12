package codes.gs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergerTwoSortedArray {

    public static int[] mergeTwoSortedArray(int[] a1, int[] a2){
        int i=0,j=0,k=0;
        int[] m = new int[a1.length+a2.length];

        while(i<a1.length && j<a2.length){
            while( (i<a1.length && j<a2.length) && a1[i]<a2[j] ) {
                m[k++] = a1[i++];
            }
            while( (j<a2.length && i<a1.length) && a2[j]<a1[i] ) {
                m[k++] = a2[j++];
            }
        }
        while(i<a1.length){
            m[k++]=a1[i++];
        }
        while(j<a2.length){
            m[k++]=a2[j++];
        }
        return m;
    }

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //int t= sc.nextInt();

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());

        int n1,n2,i;
        int[] arr1;
        int[] arr2;
        String line;
        String[] str;

        while(t>0){
            //n1= sc.nextInt();
            //n2= sc.nextInt();
            //n1= Integer.parseInt(br.readLine());
            //n2= Integer.parseInt(br.readLine());
            line= br.readLine();
            str= line.trim().split("\\s+");
            n1= Integer.parseInt(str[0]);
            n2= Integer.parseInt(str[1]);

            arr1= new int[n1];
            arr2= new int[n2];
            //how to read an integer array using buffered reader object
            line= br.readLine();
            str= line.trim().split("\\s+");
            for(i=0;i<n1;i++) {
                arr1[i] = Integer.parseInt(str[i]);
            }

            line= br.readLine();
            str= line.trim().split("\\s+");
            for(i=0;i<n2;i++) {
                arr2[i] = Integer.parseInt(str[i]);
            }
            System.out.println("A1:"+ Arrays.toString(arr1));
            System.out.println("A2:"+ Arrays.toString(arr2));
            System.out.println(Arrays.toString(mergeTwoSortedArray(arr1,arr2)));
            t--;
        }
    }
}
