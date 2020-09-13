package homeworks.homework_4;

import java.util.Random;

public class Exersise_12 {

    public static void main(String[] args) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        Random rand = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int number = rand.nextInt(4 - (-5)) + (-5);
            System.out.println("Ramdom = " + number);
            array[i] = number;
            if (number > 0) pos++;
            if (number < 0) neg++;
            if (number == 0) zero++;
        }
        System.out.println("Positive = " + pos + " " + "Negative = " + neg + " " + "Zero = " + zero);

    }

}
