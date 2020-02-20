import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReaderWriter {
    static File out_file;
    static PrintWriter pw;
    public static String[] create_array_information(String file_name) throws FileNotFoundException {
        File information = new File(file_name);
        Scanner scanner = new Scanner(information);
        String size_info = scanner.nextLine();
        String[] array_info = new String[Integer.parseInt(size_info)];
        for (int i = 0; i < array_info.length; i++) {
            String info_for_matrix_info = scanner.nextLine();
            array_info[i] = info_for_matrix_info;
        }
        scanner.close();
        return array_info;
    }

    public static void writeData(Contender[] data) throws FileNotFoundException {
        out_file = new File("OUT_FILE");
        pw = new PrintWriter(out_file);
        for (int k = 0; k < data.length; k++) {
            pw.printf("%-2d місце %s з кількістю балів: %2d\n", (k + 1), data[k].getCountryName(), data[k].getScores());
        }
        pw.close();
    }
}
