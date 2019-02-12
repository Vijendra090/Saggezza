package array;

public class ExcelColumTitle {


    public static void main(String[] arg){

        int columNumner = 28;
        int rem;
        StringBuilder colName = new StringBuilder();

        while(columNumner >0) {
            rem = columNumner%26;
            if (rem == 0) {
                colName.append("Z");
                columNumner = (columNumner / 26) - 1;
            }else {
                colName.append( (char)((rem-1) + 'A'));
                columNumner=columNumner/26;
            }
        }


        System.out.println(colName.reverse());
    }
}
