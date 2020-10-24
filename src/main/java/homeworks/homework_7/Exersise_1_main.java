package homeworks.homework_7;



import homeworks.Infrastructure.utils.randomStringGenerator;

import homeworks.Infrastructure.utils.RandomStringGenerator;

import homeworks.Infrastructure.utils.AlphaNumeric;


import homeworks.Infrastructure.utils.AlphaNumeric;


public class Exersise_1_main {

    public static void main(String[] args) {


        randomStringGenerator stringon = new randomStringGenerator();

        AlphaNumeric stringon = new AlphaNumeric();

        System.out.println(stringon.stringGenerator("alpha", 10));
        System.out.println(stringon.stringGenerator("alphaNumeric", 10));
        System.out.println(stringon.stringGenerator("numeric", 10));

        RandomStringGenerator typeEnum = new RandomStringGenerator();
        System.out.println(typeEnum.stringGenerator(RandomStringGenerator.TypeEnum.ALFANUMERIC, 10));
        System.out.println(typeEnum.stringGenerator(RandomStringGenerator.TypeEnum.ALPHA, 10));
        System.out.println(typeEnum.stringGenerator(RandomStringGenerator.TypeEnum.NUMERIC, 10));


    }

}
