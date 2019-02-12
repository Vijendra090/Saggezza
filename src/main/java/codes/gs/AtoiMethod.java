package codes.gs;

public class AtoiMethod {
    /**
     * Takes a string str and returns the int value represented by
     * the string. For example, atoi("42") returns 42.
     */
    public static int atoi(String str)
    {
        int result = 0;
        int strLength = str.length();
        int sign=1;
        for(int i = 0; i < strLength; i++)
        {
            if(i==0 && str.charAt(i)=='-' ){
                sign=-1;
                continue;
            }
            if(str.charAt(i) >='a' && str.charAt(i)<='z'){
                continue;
            }
            if(str.charAt(i)-'0' >=0 && str.charAt(i)-'0'<=9){
                result = result*10 + str.charAt(i)-'0';

            }
        }
        result=result*sign;
        //System.out.println(result);
        return result;
    }


    /**
     * boolean doTestsPass()
     * Returns true if all tests pass. Otherwise returns false.
     */
    public static boolean doTestsPass()
    {
        // todo: implement more tests, please
        // feel free to make testing more elegant
        boolean result = true;
        result = result && atoi("0") == 0;
        result = result && atoi("1") == 1;
        result = result && atoi("123") == 123;
        result = result && atoi("-1") == -1;
        result = result && atoi("-123") == -123;
        result = result && atoi("123a") == 123;
        result = result && atoi("a") == 0;

        String intMax = String.valueOf(Integer.MAX_VALUE);
        result = result && atoi(intMax) == Integer.MAX_VALUE;

        String intMin = String.valueOf(Integer.MIN_VALUE);
        result = result && atoi(intMin) == Integer.MIN_VALUE;

        return result;
    };


    /**
     * Execution entry point.
     */
    public static void main(String[] args)
    {
        if(doTestsPass())
        {
            System.out.println("All tests pass");
        }
        else
        {
            System.out.println("There are test failures");
        }
    }
}
