package homeworks.homework_2;

import static java.lang.Math.E;

public class Exersise_5 {

    //решение задачи №13

    public static void main(String[] args) {

        double x = 100;

        double a = Math.pow(Math.pow(Math.E, -2 + x), 1.0 / 5);
        double b = 1 / Math.sqrt(Math.pow(x, 2) + Math.pow(x, 4) + Math.log(Math.abs(x - 3.14)));

        double y = a * b;

        System.out.println(y);

    }

}
