package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую цифру :");
        int numberOne = scanner.nextInt();

        System.out.println("Введите вторую цифру :");
        int numberTwo = scanner.nextInt();

        System.out.println ("Введите операцию (доступные операции : +, -, *, / )");
        String operation = scanner.next ();

        if (numberOne == 0 || numberTwo == 0) {
            System.out.println("Делить на ноль нельзя!");
        }

        System.out.println (numberOne + numberTwo + operation);

    }

}
