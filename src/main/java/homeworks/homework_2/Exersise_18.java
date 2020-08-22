package homeworks.homework_2;

public class Exersise_18 {

    //решение задачи №26

    public static void main(String[] args) {

        double x = 20;

        double a = Math.log(Math.abs(Math.sin(x)));
        double b = 2 * Math.pow(Math.E, x);
        double c = 2 * Math.cos(Math.abs(x) + 2);

        double y = a + b + c;

        System.out.println(y);

    }

}
