package cricket.game;

public class MatchStatus {
    private Team tossWinner;
    private String decided;
    private Team firstBat;
    private Team firstBall;
    private Player onStrike;
    private Player nonStrike;
    private Player bowler;
    private int inning=1;

    public MatchStatus(Team tossWinner,String decided, Team firstBat, Team firstBall, Player onStrike, Player nonStrike, Player bowler) {
        this.tossWinner = tossWinner;
        this.decided = decided;
        this.firstBat = firstBat;
        this.firstBall = firstBall;
        this.onStrike = onStrike;
        this.nonStrike = nonStrike;
        this.bowler = bowler;
    }

    public MatchStatus reverseMatchStatus(){
        return new MatchStatus(tossWinner,decided,firstBall,firstBat,firstBall.getPlayers().get(0),firstBall.getPlayers().get(1),firstBat.getPlayers().get(10) );
    }

    public Team getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(Team tossWinner) {
        this.tossWinner = tossWinner;
    }

    public String getDecided() {
        return decided;
    }

    public void setDecided(String decided) {
        this.decided = decided;
    }

    public Team getFirstBat() {
        return firstBat;
    }

    public void setFirstBat(Team firstBat) {
        this.firstBat = firstBat;
    }

    public Team getFirstBall() {
        return firstBall;
    }

    public void setFirstBall(Team firstBall) {
        this.firstBall = firstBall;
    }

    public Player getOnStrike() {
        return onStrike;
    }

    public void setOnStrike(Player onStrike) {
        this.onStrike = onStrike;
    }

    public Player getNonStrike() {
        return nonStrike;
    }

    public void setNonStrike(Player nonStrike) {
        this.nonStrike = nonStrike;
    }

    public Player getBowler() {
        return bowler;
    }

    public void setBowler(Player bowler) {
        this.bowler = bowler;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    @Override
    public String toString() {
        return "cricket.game.MatchStatus{" +
                "tossWinner=" + tossWinner +
                ", firstBat=" + firstBat +
                ", firstBall=" + firstBall +
                ", onStrike=" + onStrike +
                ", nonStrike=" + nonStrike +
                ", bowler=" + bowler +
                '}';
    }
}
