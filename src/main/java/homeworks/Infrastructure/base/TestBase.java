package homeworks.Infrastructure.base;

import homeworks.Infrastructure.Logging.FileTestLogger;
import homeworks.Infrastructure.TestServer;
import homeworks.Infrastructure.wdm.DefaultWebDriverManager;
import homeworks.Infrastructure.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    private WebDriverManager wdn;
    protected TestServer server;
    protected FileTestLogger logger;
    protected WebDriver driver;
    protected JavascriptExecutor js;
    protected WebDriverWait wait;

    @Before
    public void beforeTest(){
        wdn = new DefaultWebDriverManager();
        logger = new FileTestLogger();
        server = new TestServer();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 1);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        wdn.destroyBrowser(driver);
    }

}


