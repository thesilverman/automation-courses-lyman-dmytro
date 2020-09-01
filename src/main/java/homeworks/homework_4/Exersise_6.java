package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую цифру :");
        int numberOne = scanner.nextInt();

        System.out.println("Введите вторую цифру :");
        int numberTwo = scanner.nextInt();

        System.out.println("Введите операцию (доступные операции : +, -, *, / )");
        String operation = scanner.next();

        int result = 0;

        for (int i = 1; i < 100000; i++){
            if (!operation.equals("0")) {
                switch (operation) {
                    case "+":
                        result = numberOne + numberTwo;
                        continue;
                    case "-":
                        result = numberOne - numberTwo;
                        continue;
                    case "*":
                        result = numberOne * numberTwo;
                        continue;
                    case "/":
                        result = numberOne / numberTwo;
                        continue;
                }
            }

        }

        System.out.println(numberOne + " " + operation + " " + numberTwo + " " +  " =  " + result);

    }
}


