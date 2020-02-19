import java.io.FileNotFoundException;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        dataInput[] data = createData(dataInput.create_matrix_information("/Users/nikitasakun/Desktop/Java project/laba2programming/tests/eurovision1.csv"));
        for (dataInput datum : data) {
            datum.Show_Info();
        }
    }

    public static dataInput[] createData(String[] participator) {
        dataInput[] returning = new dataInput[participator.length];
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
}
