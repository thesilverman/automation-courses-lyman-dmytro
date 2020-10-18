package homeworks.homework_7;

import homeworks.Infrastructure.utils.randomStringGenerator;

public class Exersise_1_main {

    public static void main(String[] args) {

        randomStringGenerator typeEnum = new randomStringGenerator();
        System.out.println(typeEnum.stringGenerator(randomStringGenerator.typeEnum.ALFANUMERIC, 10));
        System.out.println(typeEnum.stringGenerator(randomStringGenerator.typeEnum.ALPHA, 10));
        System.out.println(typeEnum.stringGenerator(randomStringGenerator.typeEnum.NUMERIC, 10));

    }

}
