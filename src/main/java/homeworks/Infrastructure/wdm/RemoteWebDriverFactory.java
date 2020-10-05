package homeworks.Infrastructure.wdm;

public class RemoteWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {

        BrowserType testBrowser = BrowserType.valueOf(ConfigurationManager.getInstance().getTestBrowser());
        switch (testBrowser){
            case CHROME:
                return "new Google chrome driver";
            case FIREFOX:
                return "new Mozilla firefox driver";
            default:
                return "";
        }

    }

}
