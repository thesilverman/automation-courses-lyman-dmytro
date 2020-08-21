package homeworks.homework_2;

public class Exersise_3 {

    //решение задачи №11

    public static void main(String[] args) {

        double x = 30;

        double a = 2*Math.PI*x;
        double b = Math.abs(Math.sin(Math.sqrt(10.5*x)));
        double c = 1./Math.cbrt(Math.pow(x, 2)) + 1./7;

        double y = a - b * c;

        System.out.println(y);


    }
}
