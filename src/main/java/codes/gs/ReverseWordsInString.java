package codes.gs;

public class ReverseWordsInString {
    public static String resverseWords(String str){
        String res="";
        int i,si;
        for(i=0;i<str.length();i++){
            si=i;
            while(i<str.length() && str.charAt(i)!='.')
                i++;
            if(i<str.length() && str.charAt(i)=='.'){
                res= str.substring(si,i)+ res;
                res="."+res;
            }
            else{
                res=str.substring(si,i)+res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str="my.name.is.vijendra";
        System.out.println(resverseWords(str));
    }
}
