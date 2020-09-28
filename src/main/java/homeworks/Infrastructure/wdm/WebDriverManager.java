package homeworks.Infrastructure.wdm;

public interface WebDriverManager {

    void getBrowser();
    void destroyBrowser(String browser);

//    public String createBrowser(){
//        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
//        switch (testBrowser){
//            case "chrome":
//                return "new Google Chrome driver";
//            case "firefox":
//                return "new Mozilla firefox driver";
//            default:
//                return "";
//        }
//    }
//
//    public void destroyBrowser(String browser){
//        if (browser != null){
//            System.out.println("Browser closed");
//        }
//    }

}
