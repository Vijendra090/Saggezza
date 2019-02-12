package iplCodeSolution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Utility {
    public static List<MatchDetails> getMatchDetailsFromFile(String path) throws IOException {

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

    public  HashMap<String, Double> sortByValue(HashMap<String, Double> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap<String, Double>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public HashMap<String, Integer> sortTheMapBasedOnValues(HashMap<String, Integer> match) {
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

}
