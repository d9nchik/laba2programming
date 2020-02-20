public class dataInput{
    private int score;
    private String name;
    public void Show_Info(){
        System.out.println("Страна " + this.name + " - " + this.score);
    }

    //================================================================

    public void SetScore(int score) {
        this.score = score;


    }

    public void SetName(String name) {

        this.name = name;
    }

    dataInput() {
        this.score = 1;
        this.name = "";
    }

    public int getScore(){
        return this.score;
    }

    public String getName(){
        return this.name;
    }
    //=================ФУНКЦИЯ СОРТИРОВКИ БАЛЛОВ=====================================
}
