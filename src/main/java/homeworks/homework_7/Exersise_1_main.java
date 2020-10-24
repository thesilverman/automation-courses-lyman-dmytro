package homeworks.homework_7;

import homeworks.Infrastructure.utils.RandomStringGenerator;

public class Exersise_1_main {

    public static void main(String[] args) {

        RandomStringGenerator typeEnum = new RandomStringGenerator();
        System.out.println(typeEnum.stringGenerator(RandomStringGenerator.TypeEnum.ALFANUMERIC, 10));
        System.out.println(typeEnum.stringGenerator(RandomStringGenerator.TypeEnum.ALPHA, 10));
        System.out.println(typeEnum.stringGenerator(RandomStringGenerator.TypeEnum.NUMERIC, 10));

    }

}
