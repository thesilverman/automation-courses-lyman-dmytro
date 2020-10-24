package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цифру : ");
        int factorial = sc.nextInt();

        long result = 1L;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

}
