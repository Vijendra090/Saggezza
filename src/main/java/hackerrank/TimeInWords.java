package hackerrank;

public class TimeInWords {

    public static String timeInWords(int hour, int min){
        String[] str={"o' clock","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

        if(min==15)
            return "quarter past "+str[hour];
        if(min==30)
            return "half past "+str[hour];
        if(min==45)
            return "quarter to "+str[(hour+1)%12];
        int q;
        int r;
        String time="";
        if(min<30){
            q=min/10;
            r=min%10;
            if(q*10==20) {
                if(r==0)
                    time="twenty minutes past "+str[hour];
                else
                    time="twenty "+str[r]+" minutes past "+str[hour];
            }else{
                if(r>=1 && r<10)
                    time=str[r]+" minute past "+str[hour];
                else
                    time=str[r]+" minutes past "+str[hour];
            }
        }
        if(min>=31){
            int diff= 60-min;
            if(diff>=20 && diff<=29){
                q=diff/10;
                r=diff%10;
                if(q*10==20) {
                    if(r==0)
                        time="twenty minutes to "+str[(hour+1)%12];
                    else
                        time="twenty "+str[r]+" minutes to "+str[(hour+1)%12];
                }
            }else {
                time = str[diff] + " minutes to " + str[(hour + 1) % 12];
            }
        }
        return time;
    }

    public static void main(String[] args){

        int hour=5;
        int min=38;
        System.out.println(timeInWords(hour, min));
    }
}
