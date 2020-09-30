package homeworks.homework_6;

import java.util.Scanner;

public class Exersise_7 {

    public static void main(String[] args) {

        System.out.println("Enter string to reverse:");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(1) + str.charAt(0);
            System.out.println(str);
        }
        System.out.println("Reversed string is:");
        System.out.println(reverse);

    }
}
