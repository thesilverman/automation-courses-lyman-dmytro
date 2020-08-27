package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру :");
        int j = sc.nextInt();

        double area = Math.PI * (j * j);
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2 * j;
        System.out.println("Длины окружности равна: " + circumference);
        double sphere = 4 / .3 * Math.PI * Math.pow(j, 3);
        System.out.println("Обьем круга равен: " + sphere);

    }

}
