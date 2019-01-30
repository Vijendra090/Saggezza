package hackerrank;

public class StringEncryption {

    public static String encrption(String str){

        String modified="";
        int sindex;
        //below for loop is used to remove the space in given String and store in modified.
        for(int i=0;i<str.length();i++){
            sindex=i;
            while(i<str.length() && str.charAt(i)!=' ')
                i++;
            if(i==str.length() || str.charAt(i)==' ')
                modified+=str.substring(sindex,i);
        }
        //System.out.println("Space removed string: "+modified);
        //int row= (int)Math.floor(Math.sqrt(modified.length()));
        int col= (int)Math.ceil(Math.sqrt(modified.length()));
        String res="";
        int ind;
        for(int i=0;i<col;i++){
            ind=i;
            while(ind<modified.length()) {
                res += modified.charAt(ind);
                ind+=col;
            }
            if(i<col-1)
                res+=" ";
        }
        return res;
    }
    public static void main(String[] args){
        String str="if man was meant to stay on the ground god would have given us roots";
        System.out.println("Encrypted String: "+ encrption(str));
    }
}