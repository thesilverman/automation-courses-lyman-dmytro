package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //выводит поле для ввода цифр
        System.out.println("Введите номер месяца:");

        int number_Of_DaysInMonth = 0; //изначально задаем 0 значение номеру месяца
        String MonthOfName = "Unknown"; //и название месяца

        int month = scanner.nextInt(); //ввод номера месяца

        switch (month) {
            case 1:
                MonthOfName = "Январь";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Февраль";
                number_Of_DaysInMonth = 28;
                break;
            case 3:
                MonthOfName = "Март";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "Апрель";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "Май";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "Июнь";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "Июль";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "Август";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "Сентябрь";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Октябрь";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "Ноябрь";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "Декабрь";
                number_Of_DaysInMonth = 31;
                break;
        }

        System.out.println(" В месяце " + MonthOfName + " - " + number_Of_DaysInMonth + " день ");

    }

}
