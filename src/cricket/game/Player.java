package cricket.game;

class Player {
    private  String  name;
    private  int age;
    private int score;
    private int wicket;

    public Player(String name, int age, int score, int wicket) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.wicket = wicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public  void increaseWicket(){
        this.wicket++;
    }

    @Override
    public String toString() {
        return "cricket.game.Player{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score=" + score +
                ", wicket=" + wicket +
                '}';
    }
}
