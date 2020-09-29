package homeworks.Infrastructure.wdm;

public interface WebDriverManager {

     static String getBrowser(){
        String runOn = ConfigurationManager.getInstance().getRunOn();

        switch (runOn) {
            case "local":
                return "LocalWebDriverFactory";
            case "remote":
                return "RemoteWebDriverFactory";
            case "cloud":
                return "CloudWebDriverFactory";
        }
         return runOn;
     }

    void destroyBrowser(String browser);

}
