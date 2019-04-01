package amazon;

public class PrintAllPossibleString {

    static void printPatternUtil(String str, char[] buf, int i, int j, int n){
        if(i==n){
            buf[j]='\0';
            System.out.println(buf);
            return;
        }
        buf[j]=str.charAt(i);
        printPatternUtil(str,buf,i+1,j+1,n);

        buf[j]=' ';
        buf[j+1]=str.charAt(i);
        printPatternUtil(str,buf,i+1,j+2,n);
    }
    public static void main(String[] args){
        String str="abcd";
        int n = str.length();
        char[] buf = new char[2*n];
        buf[0]=str.charAt(0);
        printPatternUtil(str,buf,1,1,n);
    }
}
