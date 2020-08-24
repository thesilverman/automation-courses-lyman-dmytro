package homeworks.homework_3;

public class Exersise_5 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 4;
        int d = 5;
        int f = 6;

        if ((a < b) & (a < c) & (a < d) & (a < f)) {
            System.out.println(a);
        } else if ((b < a) & (b < c) & (b < d) & (b < f)) {
            System.out.println(b);
        } else if ((c < a) & (c < b) & (c < d) & (c < f)) {
            System.out.println(c);
        } else if ((d < a) & (d < b) & (d < c) & (d < f)) {
            System.out.println(d);
        } else if ((f < a) & (f < b) & (f < c) & (f < d)) {
            System.out.println(f);
        }

        if ((a > b) & (a > c) & (a > d) & (a > f)) {
            System.out.println(a);
        } else if ((b > a) & (b > c) & (b > d) & (b > f)) {
            System.out.println(b);
        } else if ((c > a) & (c > b) & (c > d) & (c > f)) {
            System.out.println(c);
        } else if ((d > a) & (d > b) & (d > c) & (d > f)) {
            System.out.println(d);
        } else if ((f > a) & (f > b) & (f > c) & (f > d)) {
            System.out.println(f);
        }

    }

}
