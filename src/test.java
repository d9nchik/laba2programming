import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test {
    static File out_file;
    static PrintWriter pw;
    public static void main(String[] args) throws FileNotFoundException {
        out_file = new File("OUT_FILE");
        pw = new PrintWriter(out_file);
        dataInput[] data = createData(dataInput.create_matrix_information("/Users/nikitasakun/Desktop/Java project/laba2programming/tests/eurovision2.csv"));
        for (dataInput datum : data) {
            datum.Show_Info();
        }
        dataInput.Sort_Arr(data);
        pw.close();
    }

    public static dataInput[] createData(String[] participator) {
        dataInput[] returning = new dataInput[participator.length];
        for (int j = 0; j < participator.length; j++) {
            returning[j] = new dataInput();
        }
        for (int k = 0; k < participator.length; k++) {
            String[] temp = participator[k].split(",");
            returning[k].SetName(temp[0]);
            int sum = 0;
            for (int j = 1; j < temp.length; j++) {
                sum += Integer.parseInt(temp[j]);
            }

            returning[k].SetScore(sum);

        }
        return returning;
    }

    public static dataInput[] setPlace(dataInput[] data){
        for (int k=0; k<data.length; k++){
            if (k==0){
                data[k].SetScore(12);
            }
            else if (k==1){
                data[k].SetScore(10);
            }
            else if(k<=9) {
                data[k].SetScore(10 - k);
            }

        }
        return data;
    }
}
