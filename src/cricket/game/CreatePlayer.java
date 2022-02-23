package cricket.game;

import java.util.ArrayList;

class CreatePlayer {
   private static ArrayList<Player> team1 = new ArrayList<>();
   private static ArrayList<Player> team2 = new ArrayList<>();

    public static ArrayList<Player> createTeam1(){
        team1.add(new Player("Rohit Sharma",34,0,0));
        team1.add(new Player("Virat Kohli",33,0,0));
        team1.add(new Player("Shreyas Iyer",27,0,0));
        team1.add(new Player("Ishan Kishan",23,0,0));
        team1.add(new Player("Suryakumar Yadav",31,0,0));
        team1.add(new Player("Venkatesh Iyer",27,0,0));
        team1.add(new Player("Kuldeep Yadav",27,0,0));
        team1.add(new Player("Deepak Chahar",29,0,0));
        team1.add(new Player("Jasprit Bumrah",28,0,0));
        team1.add(new Player("Yuzvendra Chahal",31,0,0));
        team1.add(new Player("Bhuvneshwar Kumar",32,0,0));
        return team1;
    }
    public static ArrayList<Player> createTeam2(){
        team2.add(new Player("Kyle Mayers",34,0,0));
        team2.add(new Player("Shai Hope",33,0,0));
        team2.add(new Player("Nicholas Pooran",27,0,0));
        team2.add(new Player("Rovman Powell",23,0,0));
        team2.add(new Player("Kieron Pollard ",31,0,0));
        team2.add(new Player("Jason Holder",27,0,0));
        team2.add(new Player("Roston Chase",27,0,0));
        team2.add(new Player("Romario Shepherd",29,0,0));
        team2.add(new Player("Dominic Drakes",28,0,0));
        team2.add(new Player("Fabian Allen",31,0,0));
        team2.add(new Player("Hayden Walsh",32,0,0));
        return team2;
    }
}