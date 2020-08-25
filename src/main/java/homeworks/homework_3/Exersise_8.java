package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfDaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Введите номер месяца: ");
        int month = input.nextInt();

        System.out.print("Введите номер года: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "Январь";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Февраль";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "Март";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "Апрель";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "Май";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "Июнь";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "Июль";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "Август";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "Сентябрь";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "Октябрь";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "Ноябрь";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "Декабрь";
                numberOfDaysInMonth = 31;
            default:
                System.out.println("Ни один месяц не выбран");
        }
        System.out.print(" В " + MonthOfName + " " + year + " - " + numberOfDaysInMonth + " дней");
    }
}

