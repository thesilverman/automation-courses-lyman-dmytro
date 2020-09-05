package homeworks.homework_5;

public class Exersise_3 {

    public static void main(String[] args) {

        int pou = 15;
        int kil = 15;
        double lb = 2.2046;

        weightPoundsToKilograms(kil, lb);
        weightKilogramsToPounds(pou, lb);

    }

    private static void weightPoundsToKilograms(int kilograms, double lb) {
        System.out.println(kilograms * lb);
    }

    private static void weightKilogramsToPounds(int pounds, double lb) {
        System.out.println(pounds / lb);
    }

}
