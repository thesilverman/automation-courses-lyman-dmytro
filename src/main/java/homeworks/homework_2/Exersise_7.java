package homeworks.homework_2;

public class Exersise_7 {

    //решение задачи №15


    public static void main(String[] args) {

        double x = 20;

        double a = Math.abs(x * Math.log(x) - 4);
        double b = Math.sqrt(x);
        double c = 1 / Math.pow(Math.pow(Math.E, 4 * x - 1), 1./5);

        double y = (a * b) * c;

        System.out.println(y);

    }

}
