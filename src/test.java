
public class test {
    public static void main(String[] args) {
        System.out.print("Hello world!");
    }

    public static dataInput[] createData(String[] participator) {
        dataInput[] returning = new dataInput[participator.length];
        for (int k = 0; k < participator.length; k++) {
            String[] temp = participator[k].split(",");
            returning[k].SetName(temp[0]);
            int sum =0;
            for (int j =1; j<temp.length;j++){
                sum+=Integer.parseInt(temp[k]);
            }
            returning[k].SetScore(sum);
        }
        return returning;
    }
}
