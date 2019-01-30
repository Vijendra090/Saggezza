package hackerrank;

public class ExtraLongFactorial {
    public static String stringMultiplication(String s1, String s2){
        String rn1= new StringBuffer(s1).reverse().toString();
        String rn2= new StringBuffer(s2).reverse().toString();
        int[] m = new int[rn1.length()+rn2.length()];

        //go from right to left in n1
        for(int i=0;i<rn1.length();i++){
            //go from right to left in n2
            for(int j=0;j<rn2.length();j++){
                m[i+j]= m[i+j] + ((rn1.charAt(i)-'0')*(rn2.charAt(j)-'0'));
            }
        }

        String product= new String();
        //calculate each digit
        for(int i=0; i<m.length; i++){
            int digit = m[i]%10;
            int carry = m[i]/10;
            if(i+1 < m.length){
                m[i+1]= m[i+1] + carry;
            }
            product=digit+product;  //concatenate
        }
        //System.out.println("product: "+product);

        //remove the leading zeros
        while(product.charAt(0)=='0' && product.length()>1){
            product=product.substring(1);
        }
        return product;
    }

    public static String extraLongFactorial(int num){
        String snum;
        String fact="1";

        for(int i=num; i>=1; i--){
            snum= Integer.toString(i);
            fact=stringMultiplication(fact,snum);
        }
        return fact;
    }

    public static void main(String[] args){
         int number=25;

        System.out.println("Fact of 25 is : "+ extraLongFactorial(number));
    }
}
