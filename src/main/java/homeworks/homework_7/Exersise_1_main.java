package homeworks.homework_7;

import homeworks.Infrastructure.utils.randomStringGenerator;

public class Exersise_1_main {

    public static void main(String[] args) {

//        randomStringGenerator.typeEnum typeEnum = new randomStringGenerator.typeEnum().getType();
        System.out.println(randomStringGenerator.typeEnum.ALPHA);
        System.out.println(randomStringGenerator.typeEnum.ALFANUMERIC);
        System.out.println(randomStringGenerator.typeEnum.NUMERIC);

    }

}
