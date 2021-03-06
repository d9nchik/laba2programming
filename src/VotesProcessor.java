public class VotesProcessor {

    public static Contender[] processVotes(Contender[] Contenter) {
        for (int i = 0; i < Contenter.length; i++) {
            int max_index = i;
            for (int j = i + 1; j < Contenter.length; j++) {
                if (Contenter[j].getVotes() > Contenter[max_index].getVotes()) {
                    max_index = j;
                }
            }
            if (i != max_index) {
                Contender tmp = Contenter[i];
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

    public static Contender parse(String str) {

        String[] temp = str.split(",");
        int sum = 0;
        for (int j = 1; j < temp.length; j++) {
            sum += Integer.parseInt(temp[j]);
        }

        return new Contender(sum, temp[0]);
    }


}
