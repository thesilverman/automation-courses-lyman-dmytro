package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_3 {

    //Exersise_3

    public static void main(String[] args) {

        int a = 2;
        int b = 0;
        int c = 5;
        int d = 1;
        int minCoast;

        if ((a < b) & (a < c) & (a < d)) {
            System.out.println("a найменьшее число");
        } else if ((b < a) & (b < c) & (b < d)) {
            System.out.println("b найменьшее число");
        } else if ((c < a) & (c < b) & (c < d)) {
            System.out.println("c меньшее число");
        } else if ((d < a) & (d < b) & (d < c)) {
            System.out.println("d меньшее число");
        }
    }

}

