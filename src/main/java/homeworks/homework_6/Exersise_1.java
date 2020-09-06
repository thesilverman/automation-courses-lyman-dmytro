package homeworks.homework_6;

import java.io.CharArrayWriter;

public class Exersise_1 {

    public static void main(String[] args) {

        String s = "hello world!";
        String v = "HELLO WORLD!";

        chageRegisterToUppercase(s);
        changeRegisterToLowercase(v);
    }

    private static void changeRegisterToLowercase(String v) {
        StringBuilder bc = new StringBuilder(v.toLowerCase());
        System.out.println("Текст в нижний регистр = " + bc);
    }

    private static void chageRegisterToUppercase(String s) {
        StringBuilder sc = new StringBuilder(s.toUpperCase());
        System.out.println("Текст в верхний регистр = " + sc);
    }



}
