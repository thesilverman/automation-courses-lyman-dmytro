package homeworks.homework_6;

import java.util.Scanner;

public class Exersise_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш текст :");
        String a = sc.nextLine();

        int count = 0;

        if (a.length() !=0){
            count++;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Вы ввели " + count + " " + " слов");

    }

}
