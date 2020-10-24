package homeworks.Infrastructure.wdm;

public class DefaultWebDriverManager implements WebDriverManager{


//    @Override
//    public String getBrowser() {
//        String runOn = ConfigurationManager.getInstance().getRunOn();
//
//        WebDriverFactory factory;
//
//        switch (runOn) {
//            case "local":
//                factory = new LocalWebDriverFactory();
//                break;
//            case "remote":
//                factory = new RemoteWebDriverFactory();
//                break;
//            case "cloud":
//                factory = new CloudWebDriverFactory();
//                break;
//            default:
//                return "";
//        }
//        return factory.create();
//    }
        WebDriverFactory factory;

    public String getBrowser(RunOn run){

        RunOn runOn = ConfigurationManager.getInstance().getRunOn();

        switch (runOn){
            case CLOUD:
                factory = new LocalWebDriverFactory();
            case LOCAL:
                factory = new LocalWebDriverFactory();
            case REMOTE:
                factory = new RemoteWebDriverFactory();
            default:
                return "";
        }
    }

    @Override
    public String getBrowser() {
        return null;

    @Override
    public String getBrowser() {
        String runOn = ConfigurationManager.getInstance().getRunOn();

        WebDriverFactory factory;

        switch (runOn) {
            case "local":
                factory = new LocalWebDriverFactory();
                break;
            case "remote":
                factory = new RemoteWebDriverFactory();
                break;
            case "cloud":
                factory = new CloudWebDriverFactory();
                break;
            default:
                return "";
        }
        return factory.create();

    }

    @Override
    public void destroyBrowser(String browser) {

    }
}
