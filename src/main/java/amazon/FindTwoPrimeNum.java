package amazon;

public class FindTwoPrimeNum {

    public static boolean isPrime(int x){
        if(x==1)
            return false;
        int i;
        for(i=2;i<=Math.sqrt(x);i++){
            if( x%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int n= 9990;
        int i=2;
        int j=n-1;

        while(i<j){
            while(!isPrime(i)){
                i++;
            }
            while(!isPrime(j)){
                j--;
            }

            if((i+j) == n){
                System.out.println("num1: "+i+"  num2: "+j);
                break;
            }
            if(i+j > n)
                j--;
            else
                i++;
        }
    }
}
