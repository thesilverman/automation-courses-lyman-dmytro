package homeworks.homework_2;

public class Exersise_14 {

    //Решение задачи №22

    public static void main(String[] args) {

        double x = 154;

        double a = Math.log(x) / Math.pow(x, 2) + 5 * x + 1;
        double b = Math.pow(x, 3.2) / 28;

        double y = Math.asin(a) - b;

        System.out.println(y);

    }

}
