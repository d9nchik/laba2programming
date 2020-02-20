import java.io.FileNotFoundException;

public class Program {



    public static void main(String[] args) throws FileNotFoundException {
        String[] participator = ReaderWriter.create_matrix_information("C:\\Users\\danga\\IdeaProjects\\laba2programming\\tests\\eurovision2.csv");
        /*Contender[] returning = new Contender[participator.length];
        for (int j = 0; j < participator.length; j++) {
            returning[j] = new Contender();
        }*/

        Contender[] data = VotesProcessor.createData(participator);
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
