package homeworks.homework_2;

public class Exersise_9 {

    //решение задачи №17

    public static void main(String[] args) {

        double x = 12;

        double a = Math.pow(x, 3) / 3 - Math.pow(Math.E, x);
        double b = Math.log(Math.pow(1.3, 3) + Math.pow(x, 3));
        double c = 4./3;

        double y = a * b + c;

        System.out.println(y);

    }

}
