package homeworks.homework11.tests.testMySite;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class AutoTestingMySiteLogin {

    @Test
    public void PositiveTestLoginIn() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5, 1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.urlContains("wordpress/?i=1"));
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
        js.executeScript("arguments[0].scrollIntoView();", loginLink);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div/div/button/span")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        wait.until(ExpectedConditions.urlContains("/wp-admin/"));
        js.executeScript("window.scrollBy(0,1000)");
        String actualLoginMessage = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]")).getText();
        assertEquals("Howdy, admin", actualLoginMessage);
        driver.quit();

    }

    @Test
    public void NegativeTestPasswordErrorMessage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5, 1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        wait.until(ExpectedConditions.urlContains("wordpress/?i=1"));
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
        js.executeScript("arguments[0].scrollIntoView();", loginLink);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String actualTestMessageError = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The password field is empty.", actualTestMessageError);
        driver.quit();

    }

    @Test
    public void NegativeTestLoginErrorMessage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5, 1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        wait.until(ExpectedConditions.urlContains("wordpress/?i=1"));
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
        js.executeScript("arguments[0].scrollIntoView();", loginLink);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String actualTestMessageError = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The username field is empty.", actualTestMessageError);
        driver.quit();
    }

    @Test
    public void NegativeTestLoginPasswordMessageError() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5, 1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        wait.until(ExpectedConditions.urlContains("wordpress/?i=1"));
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
        js.executeScript("arguments[0].scrollIntoView();", loginLink);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        String actualMessageErrorLoginPassword = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The username field is empty.\n" +
                "Error: The password field is empty.", actualMessageErrorLoginPassword);
        driver.quit();
    }

    @Test
    public void PositiveTestLoginOut() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5, 1);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        wait.until(ExpectedConditions.urlContains("wordpress/?i=1"));
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
        js.executeScript("arguments[0].scrollIntoView();", loginLink);
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        wait.until(ExpectedConditions.urlContains("wp-admin"));
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php?loggedout=true&wp_lang=en_US"));
        driver.findElement(By.xpath("//*[@id=\"reload-button\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wp-submit\"]")));
        String actualMessageLogOut = driver.findElement(By.xpath("//*[@id=\"login\"]/p[1]")).getText();
        assertEquals("You are now logged out.", actualMessageLogOut);
        driver.quit();
    }

}
