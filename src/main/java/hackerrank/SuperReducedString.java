package hackerrank;

import java.util.ArrayList;

public class SuperReducedString {

    public static String superReducedString(String s){

        ArrayList<Character> al= new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
            al.add(s.charAt(i));

        int i=0;
        while (i<al.size()){

            while (i<al.size()-1 && al.get(i)!= al.get(i+1))
                i++;
            if (i == al.size() - 1)
                break;
            al.remove(i);
            al.remove(i);
            i=0;
        }

        if(al.size()==0)
            return "Empty String";
        String res="";
        Object[] ch = al.toArray();
        for(Object o : ch )
            res=res+o;
        return res;
    }

    public static void main(String[] arg){
        String str="aaabccddd";
        System.out.println(superReducedString(str));
    }
}
