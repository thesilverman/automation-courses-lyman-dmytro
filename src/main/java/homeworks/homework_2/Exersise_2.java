package homeworks.homework_2;

public class Exersise_2 {

    //решение задачи №10

    public static void main(String[] args) {
        double x = 70;

        double a = 1./3;
        double b = Math.sqrt(Math.abs(Math.sin(x)));
        double c = Math.cbrt(Math.pow(Math.E, 0.12 * x));

        double y = a * b * c;
        System.out.println(y);
    }
}
