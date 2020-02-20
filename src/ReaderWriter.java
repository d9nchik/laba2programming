import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReaderWriter {
    static File out_file;
    static PrintWriter pw;
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

    public static void showPlace(dataInput[] data) throws FileNotFoundException {
        out_file = new File("OUT_FILE");
        pw = new PrintWriter(out_file);
        for (int k = 0; k < data.length; k++) {
            System.out.printf("%-2d місце %s з кількістю балів: %2d\n", (k + 1), data[k].getName(), data[k].getScore());
            pw.printf("%-2d місце %s з кількістю балів: %2d\n", (k + 1), data[k].getName(), data[k].getScore());
        }
        pw.close();
    }
}
