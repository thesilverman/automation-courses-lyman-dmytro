package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_2 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Минимальное число : ");
        int min = number.nextInt();

        System.out.println("Максимальное число : ");
        int max = number.nextInt();

        System.out.println("Шаг");
        int step = number.nextInt();

        for (int i = min; i <= max; i++){
            System.out.println(i);
            i = i + step;
            i --;
        }

    }

}
