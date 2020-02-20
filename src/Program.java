import java.io.FileNotFoundException;

public class Program {



    public static void main(String[] args) throws FileNotFoundException {

        Contender[] data = VotesProcessor.createData(ReaderWriter.create_matrix_information("C:\\Users\\danga\\IdeaProjects\\laba2programming\\tests\\eurovision2.csv"));
        System.out.println("=====================================");
        System.out.println("Вот все элементы которые были в начальном файле:");
        for (Contender datum : data) {
            datum.Show_Info();
        }
        System.out.println("=====================================");
        System.out.println("Вот отсортированый рейтинг по баллам:");
        ReaderWriter.showPlace(VotesProcessor.processVotes(data));
    }


}
