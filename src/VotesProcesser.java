public class VotesProcesser {
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

    //=================ФУНКЦИЯ СОРТИРОВКИ БАЛЛОВ=====================================
    public static dataInput[] proccesVotes(dataInput[] Contenter) {
        for (int i = 0; i < Contenter.length; i++) {
            int max_index = i;
            for (int j = i + 1; j < Contenter.length; j++) {
                if (Contenter[j].getScore() > Contenter[max_index].getScore()) {
                    max_index = j;
                }
            }
            if (i != max_index) {
                dataInput tmp = Contenter[i];
                Contenter[i] = Contenter[max_index];
                Contenter[max_index] = tmp;

            }


        }
        for (int k = 0; k < Contenter.length; k++) {
            if (k == 0) {
                Contenter[k].SetScore(12);
            } else if (k == 1) {
                Contenter[k].SetScore(10);
            } else if (k <= 9)
                Contenter[k].SetScore(10 - k);

        }
        return Contenter;


    }
    //================================================================================

}
