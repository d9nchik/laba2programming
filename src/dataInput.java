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
    public static dataInput[] Sort_Arr(dataInput[]matrix_info){
        for(int i = 0;i<matrix_info.length;i++){
            int max_index = i;
            for(int j = i+1;j<matrix_info.length;j++){
                if (matrix_info[j].getScore()>matrix_info[max_index].getScore()){
                    max_index = j;
                }
            }
            if(i != max_index){
                dataInput tmp = matrix_info[i];
                matrix_info[i] = matrix_info[max_index];
                matrix_info[max_index] = tmp;

            }

        }
        return matrix_info;


    }
    //================================================================================

}
