package homeworks.homework_2;

public class Exersise_6 {

    //решение задачи №14

    public static void main(String[] args) {

        double x = 40;

        double a = Math.sqrt(Math.pow(Math.sin(x / 2), 3));
        double b = Math.cbrt(Math.pow(Math.E, 1.3 * x) + Math.pow(Math.E, -1.3 * x));
        double c = 1 / Math.abs(x + 5. / 2);

        double y = (a + b) * c;

        System.out.println(y);

    }

}
