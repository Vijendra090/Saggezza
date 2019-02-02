package iplCodeSolution;

import org.omg.PortableInterceptor.INACTIVE;
import sun.awt.image.ImageWatched;

import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException{

        Solutions solutions = new Solutions();
        Utility utility = new Utility();
        List<MatchDetails> matchDetailsList;
        List<DeliveriesDetails> deliveriesDetailsList;

        String FilePath="/home/vijendra/IdeaProjects/Saggezza/src/main/java/iplCodeSolution/";
        //String FilePath="C:\\Users\\vijendra.prasad\\IdeaProjects\\Saggezza\\src\\main\\java\\iplCodeSolution\\";
        matchDetailsList=utility.getMatchDetailsFromFile( FilePath+"matches.csv");
        deliveriesDetailsList=utility.getDeliveriesDetailsFromFile(FilePath+"deliveries.csv");

        //listing out all the season in an arraylist
        List<Integer> seasons= new ArrayList<Integer>();

        for(MatchDetails match:matchDetailsList){
            if( !seasons.contains(match.getSeason()))
                seasons.add(match.getSeason());
        }
        System.out.println("Question 1: ");
        solutions.iplProblem_Solution_1(matchDetailsList);
        System.out.println("Question 2: ");
        solutions.iplProblem_Solution_2(seasons, matchDetailsList, deliveriesDetailsList);
        System.out.println("Question 4: ");
        solutions.iplProblem_Solution_4(seasons, matchDetailsList,deliveriesDetailsList);

    }
}
