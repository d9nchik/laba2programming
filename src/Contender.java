public class Contender {
    private int votes;
    private String countryName;
    public void Show_Info(){
        System.out.println("Страна " + this.countryName + " - " + this.votes);
    }

    //================================================================

    public void SetScore(int score) {
        this.votes = score;


    }

    public void SetName(String name) {

        this.countryName = name;
    }

    Contender() {
        this.votes = 1;
        this.countryName = "";
    }

    public int getVotes(){
        return this.votes;
    }

    public String getCountryName(){
        return this.countryName;
    }
}
