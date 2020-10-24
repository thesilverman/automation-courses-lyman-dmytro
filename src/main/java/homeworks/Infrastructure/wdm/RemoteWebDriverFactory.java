package homeworks.Infrastructure.wdm;

public class RemoteWebDriverFactory implements WebDriverFactory{


    @Override
    public String create() {

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser){
            case CHROME:
                return "new Google chrome driver";
            case FIREFOX:

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
