package homeworks.Infrastructure.utils;

import java.util.Random;

public class RandomStringGenerator {

    public enum typeEnum {
        ALPHA(),
        NUMERIC(),
        ALFANUMERIC();

        private final String type;

        typeEnum (String type){
            this.type = type;
        }

    }

    public String str = "abcdefghijklmnopqrstuvwxyz";
    public String num = "0123456789";

    public String stringGenerator(String mode, int length){

         StringBuilder result = new StringBuilder();

        String tempString = "";

        if (mode.equals("alpha")){
            tempString = str;
        }
        else if (mode.equals("alphaNumeric")){
            tempString = str + num;
        }
        else if (mode.equals("numeric")){
            tempString = num;
        }

        Random rand = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(tempString.charAt(rand.nextInt(tempString.length())));
        }

        return builder.toString();
    }

}
