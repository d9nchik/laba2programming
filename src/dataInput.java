import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dataInput {
    private int score;
    private String name;
    //===============ЧТЕНИЕ ФАЙЛА И ЗАНОС СТРОК В МАССИВ СТРОК========================================
    public static String[] create_matrix_information (String file_name) throws FileNotFoundException {
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
    public void Show_Info(){
        System.out.println("Страна "+ this.name + " - " + this.score);
    }
    //================================================================
    public void SetScore(int score) {
        this.score = score;


    }

    public void SetName(String name) {
        this.name = name;
    }


}
