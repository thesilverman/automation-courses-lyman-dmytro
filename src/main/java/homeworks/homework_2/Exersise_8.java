package homeworks.homework_2;

public class Exersise_8 {

    //решение задачи №16

    public static void main(String[] args) {

        double x = 15;

        double a = Math.cbrt(Math.pow(Math.E, 2 * x) * Math.sqrt(x) - (x + 1. / 3) / x);
        double b = Math.abs(Math.cos(2.5 * x));

        double y = a * b;

        System.out.println(y);

    }

}
