import java.io.FileNotFoundException;

public class Program {



    public static void main(String[] args) throws FileNotFoundException {
        String[] participator = ReaderWriter.create_matrix_information("C:\\Users\\danga\\IdeaProjects\\laba2programming\\tests\\eurovision2.csv");
        Contender[] data = new Contender[participator.length];
        for (int j = 0; j < participator.length; j++) {
            data[j]= VotesProcessor.parse(participator[j]);
        }

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
