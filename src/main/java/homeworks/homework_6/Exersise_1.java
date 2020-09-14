package homeworks.homework_6;

import java.io.CharArrayWriter;

public class Exersise_1 {

    public static void main(String[] args) {

        String s = "hello world my friend!";
        String v = "HELLO WORLD!";

        chageRegisterToUppercase(s);
        changeRegisterToLowercase(v);
        changeFirstLetter(s);
    }

    private static void changeFirstLetter(String s) {
        String [] words = s.split("\\s");
        String snew = "";
        for (int i = 0; i < words.length; i++) {
            snew = snew + words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
        }
        System.out.println("Первые буквы каждого слова = " + snew.trim());
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
