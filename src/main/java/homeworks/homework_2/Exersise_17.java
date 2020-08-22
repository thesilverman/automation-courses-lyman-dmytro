package homeworks.homework_2;

public class Exersise_17 {

    //решение задачи №25

    public static void main(String[] args) {

        double x = 10;

         double a = Math.pow(Math.log(Math.acos(Math.abs(Math.pow(x, 3.4) + 2.5 * Math.pow(x, 1.2) - 0.7)) /
                    Math.cbrt(Math.pow(Math.E, 2.5 * x))), 1/4);

         double y = a + 1;

        System.out.println(y);

    }

}
