package homeworks.homework_7;

import homeworks.Infrastructure.utils.randomStringGenerator;

public class Exersise_1_main {

    public static void main(String[] args) {

        randomStringGenerator stringon = new randomStringGenerator();
        System.out.println(stringon.stringGenerator("alpha", 10));
        System.out.println(stringon.stringGenerator("alphaNumeric", 10));
        System.out.println(stringon.stringGenerator("numeric", 10));

    }

}
