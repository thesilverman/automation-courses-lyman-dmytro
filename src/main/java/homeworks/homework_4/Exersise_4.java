package homeworks.homework_4;

import java.util.Scanner;

public class Exersise_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру");
        String s = sc.next();

        int odd = 0, even = 0;

        for (int i = 0; i < s.length(); i++)
            if ((s.charAt(i) - '0') % 2 == 0) even++;
            else odd++;

        System.out.println("odd: "  + odd + " even: " + even);

    }

}
