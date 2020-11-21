package homeworks.homework11.tests.testMySite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTests {

    protected WebDriver driver;
    protected JavascriptExecutor js;
    protected WebDriverWait wait;

    @Before
    public void beforeTest(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 1);
        js = (JavascriptExecutor) driver;
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        driver.manage().window().maximize();
    }

//    @After
//    public void afterTest(){
//        if(driver != null){
//            driver.quit();
//        }
//    }

}
