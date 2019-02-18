package bits;

public class CountNoOfOne {
    public static void main(String[] args){
        int x = 100;
        int index=1;
        int count =0;
        while(x>0){
            if((x&1) == 1 ) {
                count += 1;
                System.out.println("-->"+index);    //indexes where 1 are there in x
            }
            x=x>>1;
            index++;
        }
        System.out.println("set bit: "+count);
    }
}
