package cricket.game;

public class CricketGame {
    public static void main(String[] args) {
       Team team1 = new Team("India",0,0,CreatePlayer.createTeam1());
       Team team2 = new Team("West Indies",0,0,CreatePlayer.createTeam2());
       MatchStatus matchStatus = CreateMatch.createMatch(team1,team2);
       MatchController matchController = new MatchController(2,matchStatus);
       matchController.startMatch();
       System.out.println("Thanks for Watching the game");
    }
}
