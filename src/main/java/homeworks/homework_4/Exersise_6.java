package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        while (true) {
            System.out.println("Введите первую цифру :");
            int numberOne = scanner.nextInt();
            System.out.println("Введите вторую цифру :");
            int numberTwo = scanner.nextInt();

            System.out.println("Введите операцию (доступные операции : +, -, *, / )");
            String operation = scanner.next();
            if (operation.equals("+")) {
                sum = numberOne + numberTwo;
                System.out.println("Равно = " + sum);
            } else if (operation.equals("-")) {
                sum = numberOne - numberTwo;
                System.out.println("Равно = " + sum);

            } else if (operation.equals("*")) {
                sum = numberOne * numberTwo;
                System.out.println("Равно = " + sum);

            } else if (operation.equals("/")) {
                if (numberTwo == 0) {
                    System.out.println("Делить на 0 нельзя!!!");
                    continue;
                }
                sum = numberOne / numberTwo;
                System.out.println("Равно = " + sum);
            } else if (operation.equals("0")) {
                System.out.println("Введен неправельный символ!!!");
                break;
            }
        }
    }
}





