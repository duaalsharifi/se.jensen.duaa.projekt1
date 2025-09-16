public class Player {
    //Attribut
    private String firstname;
    private String lastname;
    private int score = 0;

    //konstruktor
    public Player(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //metoder plus eller likamed value
    public void addToScore(int score) {
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }
}
