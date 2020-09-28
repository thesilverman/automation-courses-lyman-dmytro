package homeworks.homework_6;

import java.io.CharArrayWriter;

public class Exersise_1 {

    public static void main(String[] args) {

        String s = "hello world my friend!"; //обьявляем переменную Стринг s и вставляем туда текст
        String v = "HELLO WORLD!";

        chageRegisterToUppercase(s); //обьявляем метод и передаем в него переменную s
        changeRegisterToLowercase(v); // сюда переменную v
        changeFirstLetter(s); // сюда переменную s тоже
    }

    private static void changeFirstLetter(String s) {  // этот метод является приватным(private)
                                                      // он ничего не возвращает(void) но принимает
                                                     // переменну s(String s)
        String [] words = s.split("\\s"); // split() - разделяет строки на слова, тоесть если указать какие-то знаки и
        // регулярное выражение regex то из текста оно уберется. "(a+b) - c/d" и написать split("[()+-/+]")
        //то из текста удалятся эти знаки
        String snew = "";
        for (int i = 0; i < words.length; i++) {
            snew = snew + words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " ";
        }// метод substring выбирает определенные символы с номером индекса(начинаеться с 0)
        System.out.println("Первые буквы каждого слова = " + snew.trim()); // метод trim() возвращает строку
        //без начальных и конечных пробелов
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
