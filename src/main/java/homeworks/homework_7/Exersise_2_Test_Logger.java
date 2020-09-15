package homeworks.homework_7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exersise_2_Test_Logger {

    public static int counter = 1;

    public String Log(String operation){
        counter++;
        Date currentDate = new Date();
        currentDate.getTime();
        String formatDate = new SimpleDateFormat("HH:mm:ss.SS").format(currentDate.getTime());

        return counter + ") " + formatDate + "[" + Thread.currentThread().getName() + "] : " + operation;
    }
}
