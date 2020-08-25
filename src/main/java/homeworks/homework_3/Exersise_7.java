package homeworks.homework_3;

import java.util.Scanner;

public class Exersise_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //выводит поле для ввода цифр
        System.out.println("Введите номер месяца:");

        int numberOfDaysInMonth = 0; //изначально задаем 0 значение номеру месяца
        String MonthOfName = "Unknown"; //и название месяца

        int month = scanner.nextInt(); //ввод номера месяца

        switch (month) {
            case 1:
                MonthOfName = "Январь";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "Февраль";
                numberOfDaysInMonth = 28;
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
                break;
        }

        System.out.println(" В месяце " + MonthOfName + " - " + numberOfDaysInMonth + " день ");

    }

}
