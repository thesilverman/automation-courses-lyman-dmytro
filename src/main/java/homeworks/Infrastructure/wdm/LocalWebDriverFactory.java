package homeworks.Infrastructure.wdm;

public class LocalWebDriverFactory implements WebDriverFactory {

    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "new Google chrome driver";
            case "firefox":
                return "new Mozilla firefox driver";
            default:
                return "";
        }
    }

}
