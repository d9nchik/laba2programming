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
    public static dataInput[] Sort_Arr(dataInput[]matrix_info){
        for(int i = 0;i<matrix_info.length;i++){
            int max_index = i;
            for(int j = i+1;j<matrix_info.length;j++){
                if (matrix_info[j].getScore()>matrix_info[max_index].getScore()){
                    max_index = j;
                }
            }
            if(i != max_index){
                dataInput tmp = matrix_info[i];
                matrix_info[i] = matrix_info[max_index];
                matrix_info[max_index] = tmp;

            }

        }
        return matrix_info;


    }
    //================================================================================


}
