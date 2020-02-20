public class Contender {
    private int votes;
    private String countryName;
    private int scores;

    public String Show_Info() {
        return "Страна " + this.countryName + " - " + this.votes;
    }

    //================================================================

    public void SetScore(int score) {
        this.scores = score;


    }

    public void SetName(String name) {

        this.countryName = name;
    }

    Contender(int votes, String countryName) {
        this.votes = votes;
        this.countryName = countryName;
    }

    public int getVotes() {
        return this.votes;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public int getScores() {
        return this.scores;
    }
}
