package homeworks.Infrastructure.base;

import homeworks.Infrastructure.Logging.FileTestLogger;
import homeworks.Infrastructure.TestServer;
import homeworks.Infrastructure.wdm.DefaultWebDriverManager;
import homeworks.Infrastructure.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class TestBase {

    private WebDriverManager wdn;
    protected TestServer server;
    protected FileTestLogger logger;

    private WebDriver driver;

    public void setup(){
        wdn = new DefaultWebDriverManager();
        logger = new FileTestLogger();
        driver = wdn.getDriver();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        beforeTest();
    }

    public void tearDown(){
        wdn.destroyDriver(driver);
        afterTest();
    }

    private void beforeTest() {
        logger.atStart();
    }

    private void afterTest(){
        logger.atFinish();
    }


//    public AbstractLogger getLogger(){
//        return ConfigurationManager.getInstance().getCurrentEnvironment().equals("local") ? new StdTestLogger() :
//                new FileTestLogger();
//    }

}
