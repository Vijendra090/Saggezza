package array;

import java.util.*;

public class PrintLargestNumber {

    public static String printTheLargestNumber(ArrayList<String> number){
        String largestNum="";
        Collections.sort(number, new Comparator<String>() {

            public int compare(String o1, String o2) {
                String XY = o1+o2;
                String YX = o2+o1;
                return XY.compareTo(YX)  > 0 ? -1: 1;
            }
        });

        for(int i=0;i<number.size();i++)
            largestNum = largestNum + number.get(i);
        return largestNum;
    }

    public static void main(String[] args){

        ArrayList<String> number = new ArrayList<String>(Arrays.asList("54", "546", "548", "60"));
        System.out.println("Original number: "+number);
        System.out.println("Largest Number possible: "+ printTheLargestNumber(number));
    }
}
