package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите четное число :");
        int even = sc.nextInt();

        System.out.println("Введите нечетное число :");
        int odd = sc.nextInt();

        while (even % 2 == 0) {
            even ++;
        }odd --;
        System.out.println(even + " " + odd);
    }

}
