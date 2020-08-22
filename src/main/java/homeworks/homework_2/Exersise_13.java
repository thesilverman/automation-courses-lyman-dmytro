package homeworks.homework_2;

public class Exersise_13 {

    //решение задачи №21

    public static void main(String[] args) {

        double x = 10;

        double a = Math.pow(Math.log(x), 1./4);
        double b = x + 3;
        double c = 1 / Math.abs(x + 2 * Math.pow(x, 2));

        double y = (a + Math.acos(b)) * c;

        System.out.println(y);

    }

}
