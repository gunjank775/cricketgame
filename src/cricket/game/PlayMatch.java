package cricket.game;

import java.util.ArrayList;
import java.util.Random;

public class PlayMatch {

    public static int getScore() {
        int min=0,max=7;
        int score[] = {-1,0,1,2,3,4,6};
        Random random = new Random();
        int x= random.ints(min, max).findFirst().getAsInt();
        return score[x];
    }

    public static int random(int min,int max) {
        Random random = new Random();
        int x= random.ints(min, max).findFirst().getAsInt();
        return x;
    }
    public static void startMatch(MatchStatus matchStatus,int no_of_overs){

        int upcoming_batsman=2;
        int wicket =0;
        int current_score=0;
        boolean inning_over=false;
        Team battingTeam=matchStatus.getFirstBat();
        Team bowlingTeam=matchStatus.getFirstBall();
        Player onStrikePlayer=matchStatus.getOnStrike();
        Player onNonStrikePlayer=matchStatus.getNonStrike();
        Player bowler=matchStatus.getBowler();
        int inning = matchStatus.getInning();



        ArrayList<Player> fielder_list = new ArrayList<>();
        for(int i=0;i<11;i++){
            Player p1=bowlingTeam.getPlayers().get(i);
            fielder_list.add(p1);
        }

        System.out.println("Batsman to open "+onStrikePlayer.getName()+" and " + onNonStrikePlayer.getName());
        System.out.println("Baller- "+bowler.getName());


        for(int i=1;i<=no_of_overs;i++){
            for(int j=1;j<=6;){
                try  {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                int score=getScore();
                if(score==-1) {
                    System.out.println(onStrikePlayer.getName()+ " - W");
                    wicket++;
                    bowler.increaseWicket();
                    battingTeam.increaseWicket();
                    if (wicket == 10) {
                        inning_over = true;
                        break;
                    }
                    onStrikePlayer=battingTeam.getPlayers().get(upcoming_batsman);
                    upcoming_batsman++;
                }
                else{
                    System.out.println(onStrikePlayer.getName() + " - " +score);
                    onStrikePlayer.increaseScore(score);
                    battingTeam.increaseScore(score);
                    current_score+=score;
                    if(inning==2){
                        if(current_score>bowlingTeam.getScore()){
                            System.out.println("cricket.game.Match Finished");
                            inning_over=true;
                        }
                    }
                    if(score%2==1){
                        Player temp_player=onStrikePlayer;
                        onStrikePlayer=onNonStrikePlayer;
                        onNonStrikePlayer=temp_player;
                    }
                }
                j++;
            }
            if(i==no_of_overs) inning_over=true;
            try  {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if(!inning_over){
                Player temp_batsman=onStrikePlayer;
                onStrikePlayer=onNonStrikePlayer;
                onNonStrikePlayer=temp_batsman;

                Player temp_bowler=bowler;
                int random_bowler=random(5,10);
                bowler=fielder_list.get(random_bowler);
                fielder_list.add(random_bowler,temp_bowler);
                fielder_list.add(10,bowler);

                System.out.println("After "+i+ " over score - "+ battingTeam.getScore());
                System.out.println("After "+i+ " over wicket - "+ battingTeam.getWicket());
                System.out.println("On Strike - "+ onStrikePlayer.getName()+ " - "+onStrikePlayer.getScore());
                System.out.println("On Non Strike - "+onNonStrikePlayer.getName()+" - "+onNonStrikePlayer.getScore());
                System.out.println("On Bowling - "+bowler.getName()+" - "+bowler.getWicket());
            }
            else{
                System.out.println(battingTeam.getName()+" score - "+ battingTeam.getScore());
                System.out.println("Inning "+inning + " Finished!");
            }
            if(inning_over) break;;
        }
    }

}
