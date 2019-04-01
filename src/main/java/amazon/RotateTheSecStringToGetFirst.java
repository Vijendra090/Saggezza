package amazon;

//Given two strings, the task is to find if a string can be obtained by rotating another string two places.
public class RotateTheSecStringToGetFirst {

    static boolean isRotated(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        int len= s1.length();
        String clockwise="";    //right shift
        String anticlockwise="";    //left shift

        clockwise=clockwise+ s2.substring(2) +s2.substring(0,2);

        anticlockwise=anticlockwise+ s2.substring(len-2,len)+s2.substring(0,len-2);

        return ((s1.equals(clockwise) || s1.equals(anticlockwise)));
    }

    public static void main(String [] args){
        String s1="amazon";
        String s2="azonam";

        if(isRotated(s1,s2)==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
