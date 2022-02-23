package cricket.game;

public class Match {
    private Team team1;
    private Team team2;
    private int inning;

    public Match(Team team1, Team team2,int inning) {
        this.team1 = team1;
        this.team2 = team2;
        this.inning=inning;
    }


    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }
}
