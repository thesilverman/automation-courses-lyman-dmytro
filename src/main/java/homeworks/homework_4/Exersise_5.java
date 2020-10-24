package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_5 {

    public static void main(String[] args) {

        Scanner numberUser = new Scanner(System.in);
        System.out.println("Введите количество элементов : ");

        int number = numberUser.nextInt();

        int n0 = 1; //первый и второй номер Фибоначчи равны 1
        int n1 = 1;
        int n2;

        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= number; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

}


