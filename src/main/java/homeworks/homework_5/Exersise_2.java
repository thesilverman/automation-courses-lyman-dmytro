package homeworks.homework_5;

public class Exersise_2 {

    public static void main(String[] args) {

        double met = 100;
        double inch = 39.37;
        double kil = 1.609;
        double mil = 10;

        distanceMetersToInches(met, inch);
        distanceInchesToMeters(met, inch);
        distanceMilesToKilometers(mil, kil);
        distanceKilometersToMeters(mil, kil);

    }

    private static void distanceMetersToInches(double meters, double inches) {
        System.out.println(meters * inches);
    }

    private static void distanceInchesToMeters(double meters, double inches) {
        System.out.println(inches / meters);
    }

    private static void distanceMilesToKilometers(double miles, double kilometers) {
        System.out.println(miles * kilometers);

    }

    private static void distanceKilometersToMeters(double miles, double kilometers) {
        System.out.println(kilometers / miles);
    }

}
