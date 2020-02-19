import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dataInput {
    private int score;
    private String name;

    //===============ЧТЕНИЕ ФАЙЛА И ЗАНОС СТРОК В МАССИВ СТРОК========================================
    public static String[] create_matrix_information(String file_name) throws FileNotFoundException {
        File information = new File(file_name);
        Scanner scanner = new Scanner(information);
        String size_info = scanner.nextLine();
        String[] matrix_info = new String[Integer.parseInt(size_info)];
        for (int i = 0; i < matrix_info.length; i++) {
            String info_for_matrix_info = scanner.nextLine();
            matrix_info[i] = info_for_matrix_info;
        }
        scanner.close();
        return matrix_info;
    }

    //================================================================================================
    //==============МЕТОД ВЫВОДА======================================
    public void Show_Info() {
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
