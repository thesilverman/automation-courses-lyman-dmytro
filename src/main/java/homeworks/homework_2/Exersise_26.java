package homeworks.homework_2;

public class Exersise_26 {

    public static void main(String[] args) {

        //конвертирование времени

        int s = 360;

        int minute = s / 60;
        double hours = s / 3600d;
        double day = s / 86400d;

        System.out.println(minute + " минут в : " + s + " секундах ");
        System.out.println(hours + " часов в : " + s + " секундах ");
        System.out.println(day + " дней в : " + s + " секундах ");

        //мой возраст в минутах скундах и днях

        int my_years = 31;

        int day_in_years = 365;
        int mouth_in_years = 12;
        int week_in_month = 4;
        int minute_in_hours = 60;
        int second_in_minute = 60;

        int my_years_in_day = my_years * day_in_years;
        int my_years_in_mouth = my_years * mouth_in_years;
        int my_years_in_week = my_years * mouth_in_years * week_in_month;
        int my_years_in_hours = my_years * day_in_years * minute_in_hours;
        int my_years_in_minute = my_years * day_in_years * minute_in_hours * second_in_minute;

        System.out.println(" Мои дни " + my_years_in_day);
        System.out.println(" Мои месяцы " + my_years_in_mouth);
        System.out.println(" Мои недели " + my_years_in_week);
        System.out.println(" Мои часы " + my_years_in_hours);
        System.out.println(" Мои минуты " + my_years_in_minute);

    }

}

