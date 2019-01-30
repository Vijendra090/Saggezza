

import java.util.*;


public class ClimbingLeaderBoard {

    public static int[] climbingLeaderBoard_1(int[] score, int[] alice){
        int[] res= new int[alice.length];

        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for(int i=0; i< score.length; i++)
            if(!arrayList.contains(score[i]))
                arrayList.add(score[i]);
        System.out.println("List : "+ arrayList );

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

    public static int binarySearch(ArrayList<Integer> al, int search){
        int s=0;
        int e= al.size()-1;
        int mid;
        while(s<=e){
            mid= (s+e)/2;
            if(al.get(mid) == search)
                return mid;
            if(search < al.get(mid))
                s=mid+1;
            else
                e=mid-1;
        }
        if(s==al.size())
            return s;
        return e;
    }
    public static int[] climbingLeaderBoard_2(int[] scores, int[] alice){
        int[] res= new int[alice.length];

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=0; i< scores.length; i++)
            if(!arrayList.contains(scores[i]))
                arrayList.add(scores[i]);
        //System.out.println("List : "+ arrayList );

        for(int i=0;i<alice.length;i++){
            int index= binarySearch(arrayList, alice[i]);
            if(index<0){
                res[i]=1;
                continue;
            }
            if(index == arrayList.size() || arrayList.get(index) == alice[i] ) {
                res[i] = index + 1;
                continue;
            }
            if( index >=0 )
                res[i]=index+2;
        }
        return res;
    }
    public static void main(String[] args){
        //int[] score={100,100,50,40,40,20,10};
        //int[] alice={5,25,50,120};

        int[] score={100,90,90,80,75,60};
        int[] alice={50,65,77,90,102};
        System.out.println("Alice ranking: "+ Arrays.toString(climbingLeaderBoard_1(score, alice)));
        System.out.println("Alice ranking: "+ Arrays.toString(climbingLeaderBoard_2(score, alice)));
    }
}
