package homeworks.homework_2;

public class Exersise_4 {

    //решение задачи №12

    public static void main(String[] args) {

        double x = 40;

        double a = Math.log((Math.sqrt(Math.abs(2-x))) + 1.2);
        double b = 1./2 + Math.pow(Math.E, -x);
        double c = Math.cbrt(2./x);

        double y = a * b - c;

        System.out.println(y);

    }
}
