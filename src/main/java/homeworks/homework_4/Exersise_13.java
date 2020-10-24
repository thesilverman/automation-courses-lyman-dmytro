package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое значение массива :");
        int firstNumber = sc.nextInt();

        System.out.println("Ведите второе значение массива :");
        int secondNumber = sc.nextInt();

        System.out.println("Введите третье значение массива :");
        int thirdNumber = sc.nextInt();

        System.out.println("Введите четвертое значение массива :");
        int forthNumber = sc.nextInt();

        System.out.println("Введите пятое значение массива :");
        int fifthNumber = sc.nextInt();

        System.out.println("Введите шестое значение массива :");
        int sixNumber = sc.nextInt();


        int sum = 0;
        int[] array = {firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber, sixNumber};
        for (int num : array) {
            sum = sum + num;
        }
        long product = 1;
        for (int x = 0; x < array.length; x++) {
            product *= array[x];
        }
        System.out.println("Массив : " +
                firstNumber + " " +
                secondNumber + " " +
                thirdNumber + " " +
                forthNumber + " " +
                fifthNumber + " " +
                sixNumber + " " + "Сумма всех чисел массива : "
                + sum + " " + "Произведение элементов массива : " + product);

    }

}
