package homeworks.Infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exersise_2_Test_Logger {

    public static int counter = 1;

    public void Log(String operation){
        counter++;
        Date currentDate = new Date();
        currentDate.getTime();
        String formatDate = new SimpleDateFormat("HH:mm:ss.SS").format(currentDate.getTime());

        System.out.println(counter + ") " + formatDate + "[" + Thread.currentThread().getName() + "] : " + operation);
    }
}
