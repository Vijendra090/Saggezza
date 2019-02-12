package iplCodeSolution;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Solutions {


    public void iplProblem_Solution_1(List<MatchDetails> matches) {

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
        Utility utility = new Utility();
        for (Integer year : years.keySet()) {
            if(year==2016|| year==2017) {
                range = 0;
                for (Map.Entry<String, Integer> entry : utility.sortTheMapBasedOnValues(years.get(year)).entrySet()) {
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



    public void iplProblem_Solution_2(List<Integer> seasons,List<MatchDetails> matchDetailsList,List<DeliveriesDetails> deliveriesDetailsList){

        int fourCount,sixCount,totalCount;

        String formatPattern = "|%1$-10s|%2$-30s|%3$-20s|%4$-20s|%5$-20s|\n";
        System.out.format(formatPattern, "__________", "__________", "__________","__________","__________");
        System.out.format(formatPattern, "YEAR", "TEAM_NAME", "FOURS_COUNT", "SIXES_COUNT", "TOTAL_SCORE");
        for(Integer season: seasons){

            Set<String> seasonTeams = new HashSet<String>();
            Set<Integer> matchIds= new HashSet<Integer>();

            for(MatchDetails match: matchDetailsList){
                if(season.equals(match.getSeason())){
                    seasonTeams.add(match.getTeam1());
                    seasonTeams.add(match.getTeam2());
                    matchIds.add(match.getMatchId());
                }
            }
            for(String team: seasonTeams){
                fourCount=0;
                sixCount=0;
                totalCount=0;
                for(Integer matchId : matchIds){
                    for( DeliveriesDetails deliveries: deliveriesDetailsList){
                        if(matchId.equals(deliveries.getMatch_id()) && team.equals(deliveries.getBatting_team())){
                            if(deliveries.getBatsman_runs()== 4)
                                fourCount++;
                            if(deliveries.getBatsman_runs()== 6)
                                sixCount++;
                            totalCount+=deliveries.getTotal_runs();
                        }
                    }
                }
                System.out.format(formatPattern,season,team,fourCount,sixCount,totalCount);
            }

        }
        System.out.format(formatPattern, "__________", "__________", "__________","__________","__________");
    }

    public void iplProblem_Solution_4(List<Integer> seasons, List<MatchDetails> matchDetailsList, List<DeliveriesDetails> deliveriesDetailsList) {
        String format = "|%1$-10s|%2$-30s|%3$-20s|\n";
        System.out.format(format, "__________", "__________", "__________");
        System.out.format(format, "YEAR", "PLAYER", "NRR");
        for (Integer season : seasons) {
            // Set<String> seasonBowlers = new HashSet<String>();
            Set<Integer> matid = new HashSet<Integer>();
            Set<DeliveriesDetails> delBolList = new HashSet<DeliveriesDetails>();
            Set<String> bowlersMatchIdtoOvers = new HashSet<String>();
            Set<String> battingMatchIdtoOvers = new HashSet<String>();
            Map<String, Integer> seasonTeamBattingTotalScore = new HashMap<String, Integer>();
            Map<String, Integer> seasonTeamBowlingTotalScore = new HashMap<String, Integer>();
            for (MatchDetails match : matchDetailsList) {
                if (match.getSeason()== season) {
                    matid.add(match.getMatchId());
                    for (DeliveriesDetails delo : deliveriesDetailsList) {
                        if (delo.getMatch_id() == match.getMatchId()) {
                            delBolList.add(delo);
                            battingMatchIdtoOvers
                                    .add(delo.getMatch_id() + "," + delo.getBatting_team() + "," + delo.getOver());
                            bowlersMatchIdtoOvers
                                    .add(delo.getMatch_id() + "," + delo.getBowling_team() + "," + delo.getOver());
                            int runs = (null == seasonTeamBattingTotalScore.get(season + "," + delo.getBatting_team()))
                                    ? 0
                                    : seasonTeamBattingTotalScore.get(season + "," + delo.getBatting_team());
                            seasonTeamBattingTotalScore.put(season + "," + delo.getBatting_team(),
                                    runs = runs + delo.getTotal_runs());
                            runs = (null == seasonTeamBowlingTotalScore.get(season + "," + delo.getBowling_team())) ? 0
                                    : seasonTeamBowlingTotalScore.get(season + "," + delo.getBowling_team());
                            seasonTeamBowlingTotalScore.put(season + "," + delo.getBowling_team(),
                                    (runs = runs + delo.getTotal_runs()));
                        }
                    }
                }
            }
            Set<String> teams = new HashSet<String>();
            for(MatchDetails matchDetails: matchDetailsList){
                teams.add(matchDetails.getTeam1());
                teams.add(matchDetails.getTeam2());
            }
            double maxRunRateScore = 0;
            String teamOfYear = "";
            for (String team : teams) {
                int totalBatOvers = 0;
                int totalBowlOvers = 0;

                for (String battingMatchIdtoOver : battingMatchIdtoOvers) {
                    if (battingMatchIdtoOver.contains(team)) {
                        totalBatOvers++;
                    }
                }
                for (String bowlersMatchIdtoOver : bowlersMatchIdtoOvers) {
                    if (bowlersMatchIdtoOver.contains(team)) {
                        totalBowlOvers++;
                    }
                }

                if (null != seasonTeamBattingTotalScore.get(season + "," + team)
                        || null != seasonTeamBowlingTotalScore.get(season + "," + team)) {
                    double totalBatScore = seasonTeamBattingTotalScore.get(season + "," + team);
                    double totalBowlScore = seasonTeamBowlingTotalScore.get(season + "," + team);
                    double nRR = (totalBatScore / totalBatOvers) - (totalBowlScore / totalBowlOvers);
                    if (Double.compare(nRR, maxRunRateScore) >= 0) {
                        maxRunRateScore = nRR;
                        teamOfYear = team;
                    }

                }

            }
            System.out.format(format, season, teamOfYear, maxRunRateScore);

        }
        System.out.format(format, "__________", "__________", "__________");

    }


}
