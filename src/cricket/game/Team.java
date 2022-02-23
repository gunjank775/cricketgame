package cricket.game;

import java.util.ArrayList;

public class Team {
    private String name;
    private int score;
    private int wicket;
    private ArrayList<Player> players = new ArrayList<>();

    public Team(String name, int score, int wicket, ArrayList<Player> players) {
        this.name = name;
        this.score = score;
        this.wicket = wicket;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void increaseScore(int score){
        this.score+=score;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public void increaseWicket(){
        this.wicket++;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Player highestScorer(){
        Player mostScorer=players.get(0);
        for(int i=1;i<11;i++){
            if(mostScorer.getScore()<players.get(i).getScore()) mostScorer=players.get(i);
        }
        return mostScorer;
    }

    @Override
    public String toString() {
        return "cricket.game.Team{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", wicket=" + wicket +
                ", players=" + players +
                '}';
    }
}
