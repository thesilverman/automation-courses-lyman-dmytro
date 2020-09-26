package homeworks.Infrastructure;

import homeworks.Infrastructure.Logging.FileTestLogger;
import homeworks.Infrastructure.Logging.StdTestLogger;

public class TestBase {

    private WebDriverManager wdn;
    protected TestServer server;
    protected FileTestLogger logger;
    private String browser;

    public void setup(){
        wdn = new WebDriverManager();
        logger = new FileTestLogger();
        browser = wdn.createBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        logger.log(browser);
        beforeTest();
    }

    public void tearDown(){
        wdn.destroyBrowser(browser);
    }

    private void beforeTest() {

    }

}
