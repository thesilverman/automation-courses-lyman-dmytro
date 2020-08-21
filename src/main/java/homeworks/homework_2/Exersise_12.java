package homeworks.homework_2;

public class Exersise_12 {

    //решение задачи №20

    public static void main(String[] args) {

        double x = 10;

        double a = Math.cbrt(Math.pow(Math.log(x), 2));
        double b = Math.tan(Math.cos(Math.PI * x));
        double c = Math.abs(Math.log(x / 10.5) + 1./3);

        double y = (a + b) * c;

        System.out.println(y);

    }

}
