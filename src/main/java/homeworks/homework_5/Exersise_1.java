package homeworks.homework_5;

public class Exersise_1 {

    public static void main(String[] args) {

        double c = 35; //создаем переменные
        double f = 23;
        double k = 100;

        temperatureCelsiusToFahrenheit(c);// создаем методы под каждую переменную
        temperatureFahrenheitToCelsius(f);
        temperatureCelsiusToKelvin(c);
        temperatureKelvinToCelsius(k);

    }

    private static void temperatureKelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273;
        System.out.println("Температура Кельвина в Цельсий : " + celsius);
    }

    private static void temperatureCelsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.16;
        System.out.println("Температура Цельсия в Кельвин : " + kelvin);
    }

    private static void temperatureCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Температура Цельсия в Фаренгейт : " + fahrenheit);
    }

    private static void temperatureFahrenheitToCelsius(double fahrenheit) {
        double celsius = 5. / 9 * (fahrenheit - 32);
        System.out.println("Температура Фаренгейт в Цельсий : " + celsius);
    }

}
