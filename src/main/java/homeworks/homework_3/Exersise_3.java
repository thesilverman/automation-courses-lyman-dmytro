package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_3 {

    //Exersise_3

    public static void main(String[] args) {

        int a = 1;
        int b = 6;
        int c = 4;
        int d = 5;

        int countMin = 1;

        if ((a <= b) & (a <= c) & (a <= d)) {
            System.out.println("a найменьшее число");
            if (a == b) countMin++;
                if (a == c) countMin++;
                    if (a == d) countMin++;
        } else if ((b <= a) & (b <= c) & (b <= d)) {
            System.out.println("b найменьшее число");
            if (b == a) countMin++;
                if (b == c) countMin++;
                    if (b == d) countMin++;
        } else if ((c <= a) & (c <= b) & (c <= d)) {
            System.out.println("c меньшее число");
            if (c == a) countMin++;
                if (c == b) countMin++;
                    if (c == d) countMin++;
        } else if ((d <= a) & (d <= b) & (d <= c)) {
            System.out.println("d меньшее число");
            if (d == a) countMin++;
                 if (d == b) countMin++;
                     if (d == c) countMin++;
        }

        System.out.println(countMin);

    }

}

