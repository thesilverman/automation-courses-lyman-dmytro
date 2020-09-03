package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую цифру :");
        int numberOne = scanner.nextInt();

        int sum = 0;
        while (numberOne > 0) {
            System.out.println("Введите вторую цифру :");
            int numberTwo = scanner.nextInt();
            if (numberTwo > 0){
                System.out.println("Введите операцию (доступные операции : +, -, *, / )");
                String operation = scanner.next();
                if (operation.equals("+")){
                    sum = numberOne + numberTwo;
                    System.out.println(sum);
                }else System.out.println("Введен неправельный символ!!!");
                    if (operation.equals("-")){
                    sum = numberOne - numberTwo;
                    System.out.println(sum);
                }else System.out.println("Введен неправельный символ!!!");
                    if (operation.equals("*")) {
                    sum = numberOne * numberTwo;
                    System.out.println(sum);
                }else System.out.println("Введен неправельный символ!!!");
                    if (operation.equals("/")){
                    sum = numberOne / numberTwo;
                    System.out.println(sum);
                }else System.out.println("Введен неправельный символ!!!");
                }
            }
        System.out.println("Введен недопустимый символ!!!");
        }
    }



