package hackerrank;

public class GridSearch {

    // Complete the gridSearch function below.
    static String gridSearch(String[] G, String[] P) {
        int grow= G.length;
        int prow= P.length;
        int flag,k;
        for(int i=0; i< grow-prow+1; i++){
            k=0;
            flag=1;
            for(int j=i; j<prow+i; j++){
                if(G[j].contains(P[k++]) == false){
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                return "YES";
        }
        return "NO";

    }

    public static void main(String[] args){
        String[] G={"7283455864","6731158619","8988242643","3830589324","2229505813","5633845374","6473530293","7053106601","0834282956","4607924137"};
        String[] P={"9505","3845","3530"};

        System.out.println(gridSearch(G,P));
    }

}
