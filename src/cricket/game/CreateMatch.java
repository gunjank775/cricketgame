package cricket.game;

import java.util.Random;

class CreateMatch {
    private static MatchStatus matchStatus;
    static MatchStatus createMatch(Team team1,Team team2){
        Random random = new Random();
        int toss = random.nextInt(2); // 0-> India Winner 1-> West Indies Winner
        if(toss==0){
            int decision= random.nextInt(2);
            if(decision==0){     // 0-> opt to bat  1->opt to ball
                matchStatus=new MatchStatus(team1,"bat",team1,team2,team1.getPlayers().get(0),team1.getPlayers().get(1),team2.getPlayers().get(10));
            }
            else {
                matchStatus=new MatchStatus(team1,"ball",team2,team1,team2.getPlayers().get(0),team2.getPlayers().get(1),team1.getPlayers().get(10));
            }
            //  System.out.println(matchStatus);
        }
        else {
            int decision= random.nextInt(2);
            if(decision==0){     // 0-> opt to bat  1->opt to ball
                matchStatus=new MatchStatus(team2,"bat",team2,team1,team2.getPlayers().get(0),team2.getPlayers().get(1),team1.getPlayers().get(10));
            }
            else {
                matchStatus=new MatchStatus(team2,"ball",team1,team2,team1.getPlayers().get(0),team1.getPlayers().get(1),team2.getPlayers().get(10));
            }

        }
        return matchStatus;
    }
}
