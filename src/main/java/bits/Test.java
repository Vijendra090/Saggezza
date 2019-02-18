package bits;

public class Test {

    public static void main(String[] args){
        int m=1,i=0;
        m=~m;
        while(i++<8){
            System.out.println(m);
            m=m>>1;
        }
    }
}
