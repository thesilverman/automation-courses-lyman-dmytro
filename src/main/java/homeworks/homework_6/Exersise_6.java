package homeworks.homework_6;

public class Exersise_6 {

    public static void main(String[] args) {

        String first = "AX6BYU56UX6CV6BNT7NM 287430";
        String second = "AX6BYU56UX6CV6BNT7NM 287430";

      //  first = first.split("[0-20]", "");
        second = second.replaceAll("[^A-Z]", "");

        System.out.println(first);

}
}
