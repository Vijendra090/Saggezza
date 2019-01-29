public class StringMultiplication {
    public static void main(String [] args){
        //String n1="1235421415454545454545454544";
        //String n2="1714546546546545454544548544544545";

        String n1= "123";
        String n2= "1";
        String rn1= new StringBuffer(n1).reverse().toString();
        String rn2= new StringBuffer(n2).reverse().toString();
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
        System.out.println("product: "+product);
    }
}
