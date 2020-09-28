package homeworks.Infrastructure;

import java.util.Random;

public class AlphaNumeric {

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
