package homeworks.homework_4;

public class Exersise_14 {

    public static void main(String[] args) {

        // [2][6]
        int [][] array = {
                {1, 2, 3, 444, 5, 6},
                {7, 8, 9, -10, 11, 12}
        };
        String positionMax = "";
        String positionMin = "";
        int max = array[0][0];
        int min = array[0][0];;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= max){
                    max = array[i][j];
                    positionMax = i + " " + j;

                }
                if (array[i][j] <= min){
                    min = array[i][j];
                    positionMin = i + " " + j;
                }
            }
        }
        System.out.println("max=" + max + "min=" +min + " positionMax=" + positionMax + " positionMin=" + positionMin);
    }

}
