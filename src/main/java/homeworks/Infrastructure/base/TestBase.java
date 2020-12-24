package homeworks.Infrastructure.base;

import homeworks.Infrastructure.Logging.FileTestLogger;
import homeworks.Infrastructure.TestServer;
import homeworks.Infrastructure.wdm.DefaultWebDriverManager;
import homeworks.Infrastructure.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    private WebDriverManager wdn;
    protected TestServer server;
    protected FileTestLogger logger;


    private WebDriver driver;

    public void setup(){

    protected WebDriver driver;
    protected JavascriptExecutor js;
    protected WebDriverWait wait;

    @Before
    public void beforeTest(){

        wdn = new DefaultWebDriverManager();
        logger = new FileTestLogger();
        driver = wdn.getDriver();
        server = new TestServer();

        String url = server.getUrl();
        logger.log(url);
        beforeTest();

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 1);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        wdn.destroyDriver(driver);
        afterTest();
    }

    private void beforeTest() {
        logger.atStart();
    }

    private void afterTest(){
        logger.atFinish();
        wdn.destroyBrowser(driver);
    }

}


