package homeworks.homework_6;

public class Exersise_6 {

    public static void main(String[] args) {

        String first = "AX6BYU56UX6CV6BNT7NM";

        first = first.replaceAll("[A-Z]+", "");
        System.out.println(first.substring(0, 2));
        System.out.println(first.substring(2, 4));
        System.out.println(first.substring(4, 6));

        int i = Integer.parseInt(first.substring(0, 2));
        int c = Integer.parseInt(first.substring(3, 5));
        int b = Integer.parseInt(first.substring(4, 6));

        System.out.println(i * c * b);

    }

}
