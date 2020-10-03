package homeworks.Infrastructure.wdm;

public class CloudWebDriverFactory implements WebDriverFactory{

    public String create(BrowserType browserType) {
        switch (browserType){
            case CHROME:
                return "new Google chrome driver";
            case FIREFOX:
                return "new Mozilla firefox driver";
            default:
                return "";
        }

//        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
//        switch (testBrowser) {
//            case "chrome":
//                return "new Google chrome driver";
//            case "firefox":
//                return "new Mozilla firefox driver";
//            default:
//                return "";
//        }
    }


    @Override
    public String create() {
        return null;
    }
}
