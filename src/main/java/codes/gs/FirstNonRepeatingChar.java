package codes.gs;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, i,flag;
        int[] freq;
        String str;
        while (t > 0) {
            n = sc.nextInt();
            sc.nextLine();
            str = sc.nextLine();
            flag=0;
            System.out.println("-->"+str);
            freq = new int[26];
            for (i = 0; i < str.length(); i++) {
                freq[ str.charAt(i)-'a']++;
            }
            for (i = 0; i < str.length(); i++) {
                if (freq[str.charAt(i)-'a'] == 1) {
                    flag=1;
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if(flag==0)
                System.out.println(-1);
            t--;
        }
    }
}
