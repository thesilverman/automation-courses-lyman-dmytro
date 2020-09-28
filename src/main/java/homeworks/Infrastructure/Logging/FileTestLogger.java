package homeworks.Infrastructure.Logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTestLogger {

    public Object FileWriter;
    public static int counter = 0;

    public void log(String operation) {
        counter++;
        Date currentDate = new Date();
        currentDate.getTime();
        String formatDate = new SimpleDateFormat("HH:mm:ss.SS").format(currentDate.getTime());
        try {
            java.io.FileWriter fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter
                    .write(counter + ") " + formatDate + "[" + Thread.currentThread().getName() + "] : " + operation + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
