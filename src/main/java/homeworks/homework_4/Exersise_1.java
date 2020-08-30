package homeworks.homework_4;

import java.util.Random;

public class Exersise_1 {

    public static void main(String[] args) {

        Random rand = new Random();

        int userNumber = 30;
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(100);
            if (userNumber == randomNumber) {
                System.out.println("Число №" + randomNumber + " = " + userNumber + " - "  + "Бинго!");
                break;
            } 
        }
    }

}


