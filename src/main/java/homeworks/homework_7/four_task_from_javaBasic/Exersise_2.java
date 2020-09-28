package homeworks.homework_7.four_task_from_javaBasic;

//Напишите программу, где пользователь
// вводит любое целое положительное число.
// А программа суммирует все числа от 1 до
// введенного пользователем числа.

import java.util.Scanner;

public class Exersise_2 {

    public static void main(String[] args) {

        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);

    }

}
