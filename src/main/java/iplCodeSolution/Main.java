package iplCodeSolution;

import java.io.*;
import java.util.*;

public class Main {

    public static HashMap<String, Integer> sortTheMapBasedOnValues(HashMap<String, Integer> match) {
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(match.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });

        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void iplProblem_Solution_1(List<MatchDetails> matches) {

        Map<Integer, HashMap<String, Integer>> years = new HashMap<Integer, HashMap<String, Integer>>();
        for (MatchDetails match : matches) {

            HashMap<String, Integer> teamsCount = years.get(match.getSeason());
            if (teamsCount == null) {   //If year not in the Map
                if (match.getTossDecision().equals("field")) {
                    teamsCount = new HashMap<String, Integer>();
                    teamsCount.put(match.getTossWinner(), 1);
                    years.put(match.getSeason(), teamsCount);
                }
            } else {  //if not null then we have a map object for that specific year
                if (match.getTossDecision().equals("field")) {
                    if (teamsCount.get(match.getTossWinner()) != null) {
                        teamsCount.put(match.getTossWinner(), teamsCount.get(match.getTossWinner()) + 1);
                    } else {
                        teamsCount.put(match.getTossWinner(), 1);
                    }
                    years.put(match.getSeason(), teamsCount);
                }
            }
        }

        String formatPattern = "|%1$-10s|%2$-25s|%3$-10s|\n";
        System.out.format(formatPattern, "__________", "__________", "__________");
        System.out.format(formatPattern, "YEAR", "TEAM", "COUNT");
        int range;
        for (Integer year : years.keySet()) {
            if(year==2016|| year==2017) {
                range = 0;
                for (Map.Entry<String, Integer> entry : sortTheMapBasedOnValues(years.get(year)).entrySet()) {
                    if (range++ < 4) {
                        System.out.format(formatPattern, year, entry.getKey(), entry.getValue());
                        continue;
                    }
                    break;
                }
            }
        }
        System.out.format(formatPattern, "__________", "__________", "__________");
    }

    public static List<MatchDetails> getMatchDetailsFromFile( String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = "";
        String[] row;
        int index;
        reader.readLine();
        List<MatchDetails> matches = new ArrayList<MatchDetails>();
        while ((line = reader.readLine()) != null) {
            row= line.split(",");
            index = 0;
            MatchDetails matchDetails = new MatchDetails();
            for (String column : row) {
                if (index == 0)
                    matchDetails.setMatchId(Integer.parseInt(column));
                if (index == 1)
                    matchDetails.setSeason(Integer.parseInt(column));
                if (index == 2)
                    matchDetails.setCity(column);
                if (index == 3)
                    matchDetails.setDate(column);
                if (index == 4)
                    matchDetails.setTeam1(column);
                if (index == 5)
                    matchDetails.setTeam2(column);
                if (index == 6)
                    matchDetails.setTossWinner(column);
                if (index == 7)
                    matchDetails.setTossDecision(column);
                if (index == 8)
                    matchDetails.setResult(column);
                if (index == 9)
                    matchDetails.setWinner(column);
                index++;
            }
            matches.add(matchDetails);
        }
        return matches;
    }

    public static List<DeliveriesDetails> getDeliveriesDetailsFromFile(String path) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        reader.readLine();  //to remove the header line
        String line="";
        int index;
        List<DeliveriesDetails> deliveries= new ArrayList<DeliveriesDetails>();
        while((line=reader.readLine())!=null){
            index=0;
            String[] row= line.split(",");
            DeliveriesDetails deliveriesDetails= new DeliveriesDetails();
            for (String column : row) {
                if (index == 0)
                    deliveriesDetails.setMatch_id(Integer.parseInt(column));
                if (index == 1)
                    deliveriesDetails.setInning(Integer.parseInt(column));
                if (index == 2)
                    deliveriesDetails.setBatting_team(column);
                if (index == 3)
                    deliveriesDetails.setBowling_team(column);
                if (index == 4)
                    deliveriesDetails.setOver(Integer.parseInt(column));
                if (index == 5)
                    deliveriesDetails.setBall(Integer.parseInt(column));
                if (index == 6)
                    deliveriesDetails.setBatsman(column);
                if (index == 7)
                    deliveriesDetails.setBowler(column);
                if (index == 8)
                    deliveriesDetails.setWide_runs(Integer.parseInt(column));
                if (index == 9)
                    deliveriesDetails.setBye_runs(Integer.parseInt(column));
                if (index == 10)
                    deliveriesDetails.setLegbye_runs(Integer.parseInt(column));
                if (index == 11)
                    deliveriesDetails.setNoball_runs(Integer.parseInt(column));
                if (index == 12)
                    deliveriesDetails.setPenalty_runs(Integer.parseInt(column));
                if (index == 13)
                    deliveriesDetails.setBatsman_runs(Integer.parseInt(column));
                if (index == 14)
                    deliveriesDetails.setExtra_runs(Integer.parseInt(column));
                if (index == 15)
                    deliveriesDetails.setTotal_runs(Integer.parseInt(column));
                index++;
            }
            deliveries.add(deliveriesDetails);
        }
        return deliveries;
    }

    public static void iplProblem_Solution_2(List<DeliveriesDetails> deliveriesDetails){
        for(DeliveriesDetails details : deliveriesDetails){
            System.out.println(details);
        }
    }

    public static void main (String[] args) throws IOException{

        List<MatchDetails> matchDetailsList;
        List<DeliveriesDetails> deliveriesDetailsList;
        List<Integer> season;
        String FilePath="C:\\Users\\vijendra.prasad\\IdeaProjects\\Saggezza\\src\\main\\java\\iplCodeSolution\\";
        matchDetailsList=getMatchDetailsFromFile( FilePath+"matches.csv");
        deliveriesDetailsList=getDeliveriesDetailsFromFile(FilePath+"deliveries.csv");

        iplProblem_Solution_1(matchDetailsList);

        iplProblem_Solution_2(deliveriesDetailsList);
    }
}
