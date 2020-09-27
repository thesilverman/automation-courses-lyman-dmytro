package homeworks.Infrastructure.Logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface AbstractLogger {

    String WELCOME_MESSAGE = "Test suite started at %s";
    String FINAL_MESSAGE = "Test suite final at %s";

    void log(String operation);

    void atFinish();

    void atStart();

}
