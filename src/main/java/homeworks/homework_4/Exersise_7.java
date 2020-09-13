package homeworks.homework_4;

public class Exersise_7 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int middle = 0;
        int sum = 0;

        for (int x: array) {
            sum += x;

        }      middle = sum/array.length;
        System.out.println(middle);
        for (int y: array) {
            if (y< middle){
                System.out.println(y);
            }
        }


    }

}
