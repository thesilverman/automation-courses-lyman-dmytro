package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую цифру :");
        int numberOne = scanner.nextInt();

        System.out.println("Введите вторую цифру :");
        int numberTwo = scanner.nextInt();

        System.out.println("Введите операцию (доступные операции : +, -, *, / )");
        String operation = scanner.next();

        int result = 0;

        switch (operation) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println("Делить на 0 нельзя!");
                }
                result = numberOne / numberTwo;
                break;
            default:
                System.out.println("Эта операция некорректна!");
        }

            System.out.println(result);

        }


    }
