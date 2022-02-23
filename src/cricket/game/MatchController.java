package cricket.game;

import java.util.ArrayList;

public class MatchController {
    private int no_of_overs;
    private MatchStatus matchStatus;



    public MatchController(int no_of_overs, MatchStatus matchStatus) {
        this.no_of_overs = no_of_overs;
        this.matchStatus = matchStatus;
    }

    public void startMatch(){
        Team tosswinner=matchStatus.getTossWinner();
        Team batFirst=matchStatus.getFirstBat();
        Team ballFirst=matchStatus.getFirstBall();
        System.out.println(tosswinner.getName() + " Won the toss and decided to "+matchStatus.getDecided());
        PlayMatch.startMatch(matchStatus,no_of_overs);
        matchStatus=matchStatus.reverseMatchStatus();
        matchStatus.setInning(2);
        PlayMatch.startMatch(matchStatus,no_of_overs);
        int scoreBatFirst=batFirst.getScore();
        int scoreBallFirst=ballFirst.getScore();
        if(scoreBatFirst==scoreBallFirst){
            System.out.println("cricket.game.Match Draw");
        }
        else if(scoreBallFirst<scoreBatFirst){
            System.out.println(batFirst.getName()+" Won the cricket.game.Match");
            Player mostScorer=batFirst.highestScorer();
            System.out.println("Highest Scorer is "+mostScorer.getName()+" with score "+mostScorer.getScore());
        }
        else{
            System.out.println(ballFirst.getName()+" Won the cricket.game.Match");
            Player mostScorer=ballFirst.highestScorer();
            System.out.println("Highest Scorer is "+mostScorer.getName()+" with score "+mostScorer.getScore());
        }
    }


}
