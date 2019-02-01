package iplCodeSolution;

import java.io.*;
import java.util.*;

public class Main {

    public static void top4TeamsElectedToFieldFirstAfterWinningToss(List<MatchDetails> matches){
        TreeMap<String, Integer> teamWinTossCount= new TreeMap<String, Integer>();
        for(MatchDetails match: matches){

            if(match.getSeason()==2017 || match.getSeason()==2016){
                Integer c = teamWinTossCount.get(match.getTossWinner());
                if(c==null)
                    teamWinTossCount.put(match.getTossWinner(),1);
                else
                    teamWinTossCount.put(match.getTossWinner(),++c);
            }
        }

        System.out.println(teamWinTossCount);
    }

    public static void main(String[] args) throws IOException {

        //input stream to read a file
        BufferedReader reader = new BufferedReader(new FileReader("/home/vijendra/IdeaProjects/Saggezza/src/main/java/iplCodeSolution/matches.csv"));
        String line="";
        String[] row;
        int index;
        reader.readLine();
        List<MatchDetails> matches= new ArrayList<MatchDetails>();
        while((line=reader.readLine())!=null){
//            System.out.println(line);
            row= line.split(",");
            if( Integer.parseInt(row[1])!=2017 && Integer.parseInt(row[1])!=2016)
                continue;
//            for(int i=0;i<row.length;i++)
//                System.out.print(row[i]+"->");
            index=0;
            MatchDetails matchDetails= new MatchDetails();
            for(String column: row){
                if(index==0)
                    matchDetails.setMatchId(Integer.parseInt(column));
                if(index==1)
                    matchDetails.setSeason(Integer.parseInt(column));
                if(index==2)
                    matchDetails.setCity(column);
                if(index==3)
                    matchDetails.setDate(column);
                if(index==4)
                    matchDetails.setTeam1(column);
                if(index==5)
                    matchDetails.setTeam2(column);
                if(index==6)
                    matchDetails.setTossWinner(column);
                if(index==7)
                    matchDetails.setTossDecision(column);
                if(index==8)
                    matchDetails.setResult(column);
                if(index==9)
                    matchDetails.setWinner(column);
                index++;
            }
            matches.add(matchDetails);
        }

        top4TeamsElectedToFieldFirstAfterWinningToss(matches);
    }
}
