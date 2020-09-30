package homeworks.Infrastructure.Logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class  StdTestLogger implements AbstractLogger{

    public static int counter = 1;

    public void log(String operation){
        System.out.println(getEntry(operation));
    }

    private String getEntry(String operation){
        counter++;
        Date currentDate = new Date();
        currentDate.getTime();
        String formatDate = new SimpleDateFormat("HH:mm:ss.SS").format(currentDate.getTime());

        return counter + ") " + formatDate + "[" + Thread.currentThread().getName() + "] : " + operation;
    }

    public void atFinish(){

    }

    public void atStart(){

    }

}
