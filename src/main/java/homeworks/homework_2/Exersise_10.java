package homeworks.homework_2;

public class Exersise_10 {

    public static void main(String[] args) {

        //решение задачи №18

        double x = 44;

        double a = Math.abs(7.2 - 10 * x) / Math.cbrt(Math.pow(x, 2) + Math.pow(Math.E, x));
        double b = Math.atan(4 * (x / 3)) / Math.sqrt(Math.pow(1.1, 3) + Math.pow(x, 2));

        double y = a * b;

        System.out.println(y);

    }

}
