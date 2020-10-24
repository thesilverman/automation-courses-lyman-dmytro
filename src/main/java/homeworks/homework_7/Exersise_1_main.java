package homeworks.homework_7;


import homeworks.Infrastructure.utils.randomStringGenerator;

import homeworks.Infrastructure.utils.AlphaNumeric;


public class Exersise_1_main {

    public static void main(String[] args) {

        randomStringGenerator stringon = new randomStringGenerator();

        AlphaNumeric stringon = new AlphaNumeric();

        System.out.println(stringon.stringGenerator("alpha", 10));
        System.out.println(stringon.stringGenerator("alphaNumeric", 10));
        System.out.println(stringon.stringGenerator("numeric", 10));

    }

}
