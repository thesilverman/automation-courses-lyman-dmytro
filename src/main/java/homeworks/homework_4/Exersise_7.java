package homeworks.homework_4;

public class Exersise_7 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int middle = 0;

        for (int x: array) {
            middle += x;
            System.out.println(middle/array.length);
        }

    }

}
