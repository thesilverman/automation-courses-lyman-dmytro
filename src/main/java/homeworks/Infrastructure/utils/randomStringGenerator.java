package homeworks.Infrastructure.utils;

import java.util.Random;

public class randomStringGenerator {

     public enum typeEnum {
        ALPHA("alfa"),
        NUMERIC("numeric"),
        ALFANUMERIC("alphaNumeric");

         typeEnum(String mode) {
         }
     }

    public String str = "abcdefghijklmnopqrstuvwxyz";
    public String num = "0123456789";

    public String stringGenerator(typeEnum mode, int length){
        String tempString = "";
        switch (mode){
            case ALPHA:
                tempString = str;
            case NUMERIC:
                tempString = num;
            case ALFANUMERIC:
                tempString = str + num;
        }

        Random rand = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(tempString.charAt(rand.nextInt(tempString.length())));
        }

        return builder.toString();
    }

}
