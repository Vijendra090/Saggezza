package amazon;

public class FlippedCount {

    public static void main(String [] args){
        int x=10;
        int y=20;
        int count=0;
        int num= x^y;
        System.out.println("-->"+num);
        while(num>0){
            if((num&1)==1)
                count++;
            num=num>>1;
        }
        System.out.println(count);
    }
}
