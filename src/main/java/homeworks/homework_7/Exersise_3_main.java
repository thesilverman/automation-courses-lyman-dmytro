package homeworks.homework_7;

public class Exersise_3_main {

    public static void main(String[] args) {

        Exersise_3_FractionNumbers number = new Exersise_3_FractionNumbers(1, 2);
        Exersise_3_FractionNumbers number1 = new Exersise_3_FractionNumbers(1, 4);

        System.out.println(number);
        System.out.println(number1);

        Exersise_3_FractionNumbers plusResult = number.plus(number1);
        System.out.println(plusResult);

        Exersise_3_FractionNumbers minusResult = number.minus(number1);
        System.out.println(minusResult);

        Exersise_3_FractionNumbers multiplyResult = number.multiply(number1);
        System.out.println(multiplyResult);

        Exersise_3_FractionNumbers deriveResult = number.derive(number1);
        System.out.println(deriveResult);

    }

}
