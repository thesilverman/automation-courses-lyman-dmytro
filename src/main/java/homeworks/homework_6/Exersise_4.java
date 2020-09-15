package homeworks.homework_6;

public class Exersise_4 {

    public static void main(String[] args) {

        String s = "Привет как твои дела?";
        findCount(s);

    }

    private static void findCount(String s) {

        s = s.replaceAll("\\s+", " ");
        String[] s1 = s.split(" ");
        System.out.println(s1.length);

    }

}
