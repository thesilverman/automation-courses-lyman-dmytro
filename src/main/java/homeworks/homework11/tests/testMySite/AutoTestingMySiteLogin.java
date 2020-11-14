package homeworks.homework11.tests.testMySite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class AutoTestingMySiteLogin {

    @Test
    public void PositiveTestLoginIn() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        Thread.sleep(3000);
        String actualLoginMessage = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]")).getText();
        assertEquals("Howdy, admin", actualLoginMessage);
        driver.quit();

    }

    @Test
    public void NegativeTestPasswordErrorMessage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String actualTestMessageError = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The password field is empty.", actualTestMessageError);
        driver.quit();

    }

    @Test
    public void NegativeTestLoginErrorMessage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String actualTestMessageError = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The username field is empty.", actualTestMessageError);
        driver.quit();
    }

    @Test
    public void NegativeTestLoginPasswordMessageError() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String actualMessageErrorLoginPassword = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The username field is empty.\n" +
                "Error: The password field is empty.", actualMessageErrorLoginPassword);
        driver.quit();
    }

    @Test
    public void PositiveTestLoginOut() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"reload-button\"]")).click();
        Thread.sleep(2000);
        String actualMessageLogOut = driver.findElement(By.xpath("//*[@id=\"login\"]/p[1]")).getText();
        assertEquals("You are now logged out.", actualMessageLogOut);
        driver.quit();
    }

}
