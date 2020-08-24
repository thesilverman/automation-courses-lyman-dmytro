package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Введите номер месяца: ");
        int month = input.nextInt();

        System.out.print("Введите номер года: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "Январь";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Февраль";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
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
        }
        System.out.print(" В " + MonthOfName + " " + year + " - " + number_Of_DaysInMonth + " дней\n");
    }
}

