

import java.util.*;


public class ClimbingLeaderBoard {

    public static int[] climbingLeaderBoard(int[] score, int[] alice){
        int[] res= new int[alice.length];

        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for(int i=0; i< score.length; i++)
            if(!arrayList.contains(score[i]))
                arrayList.add(score[i]);
        System.out.println("HashSet : "+ arrayList );

        for(int i=0;i<alice.length;i++){
            for(int j= arrayList.size()-1 ; j>=0; j--){
                if(alice[i]< arrayList.get(j)){
                    res[i]=j+2;
                    break;
                }
                if(alice[i]==arrayList.get(j)){
                    res[i]=j+1;
                    break;
                }
                if(j==0)
                    res[i]=1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        //int[] score={100,100,50,40,40,20,10};
        //int[] alice={5,25,50,120};

        int[] score={100,90,90,80,75,60};
        int[] alice={50,65,77,90,102};
        System.out.println("Alice ranking: "+ Arrays.toString(climbingLeaderBoard(score, alice)));
    }
}
