package amazon;

public class RightMostSetBit {

    public static void main(String[] args){
        int num= 19;
        int pos=1;
        int mask=1;
        while( (num&mask)==0){
            pos++;
            mask=mask<<1;
        }
        System.out.println("--->"+pos);
    }
}
