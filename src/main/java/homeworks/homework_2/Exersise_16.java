package homeworks.homework_2;

public class Exersise_16 {

    //решение задачи №24

    public static void main(String[] args) {

        double x = 10;

        double a = Math.abs(8.3 - 21 * Math.pow(x, 2) - 0.8 * x) / Math.cbrt(2.5 + 1 / Math.pow(x, 2));
        double y = Math.atan(a);

        System.out.println(y);

    }

}
