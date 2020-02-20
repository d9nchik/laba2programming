import java.io.FileNotFoundException;

public class Program {


    public static void main(String[] args) throws FileNotFoundException {

        dataInput[] data = VotesProcesser.createData(ReaderWriter.create_matrix_information("C:\\Users\\danga\\IdeaProjects\\laba2programming\\tests\\eurovision2.csv"));
        System.out.println("=====================================");
        System.out.println("Вот все элементы которые были в начальном файле:");
        for (dataInput datum : data) {
            datum.Show_Info();
        }
        System.out.println("=====================================");
        System.out.println("Вот отсортированый рейтинг по баллам:");
        ReaderWriter.showPlace(setPlace(dataInput.Sort_Arr(data)));
    }


    public static dataInput[] setPlace(dataInput[] data) {
        for (int k = 0; k < data.length; k++) {
            if (k == 0) {
                data[k].SetScore(12);
            } else if (k == 1) {
                data[k].SetScore(10);
            } else if (k <= 9)
                data[k].SetScore(10 - k);

        }
        return data;
    }


}