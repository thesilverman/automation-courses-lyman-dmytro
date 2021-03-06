package homeworks.Infrastructure.utils;

import java.util.Random;

public class RandomStringGenerator {

     public enum TypeEnum {
        ALPHA("alfa", 10),
        NUMERIC("numeric", 10),
        ALFANUMERIC("alphaNumeric", 10);

         TypeEnum(String mode, int lenght) {
         }
     }

    public String str = "abcdefghijklmnopqrstuvwxyz";
    public String num = "0123456789";

    public String stringGenerator(TypeEnum mode, int length){
        String tempString = "";
        switch (mode){
            case ALPHA:
                tempString = str;
                break;
            case NUMERIC:
                tempString = num;
                break;
            case ALFANUMERIC:
                tempString = str + num;
                break;
        }

        Random rand = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(tempString.charAt(rand.nextInt(tempString.length())));
        }

        return builder.toString();
    }

}
