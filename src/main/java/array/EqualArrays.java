package array;

public class EqualArrays {

    public static int findMax(int[] a){
        int max=a[0];
        for(int i=1; i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        return max;
    }

    public static boolean isEqualArrays(int[] a1, int[] a2){
        int l1=a1.length;
        int l2=a2.length;
        if(l1!=l2)
            return false;
        int m1= findMax(a1);
        int m2= findMax(a2);

        if(m1!=m2)
            return false;
        int[] f1= new int[m1+1];
        int[] f2= new int[m1+1];
        for(int i=0;i<l1;i++){
            f1[a1[i]]++;
            f2[a2[i]]++;
        }
        for(int i=0;i<l1;i++){
            if(f1[a1[i]] != f2[a1[i]])
                return false;
        }
        return true;
    }

    public static void main(String [] args){
        int[] a1= {1, 7, 1};
        int[] a2= {7, 7, 1};

        if(true == isEqualArrays(a1,a2)){
            System.out.println("both arrays are equal");
        }else {
            System.out.println("both arrays are not equal");
        }
    }
}
