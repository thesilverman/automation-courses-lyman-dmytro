package homeworks.homework11.tests.testMySite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class AutoTestSite {

    public static void main(String[] args) throws InterruptedException {

        WebDriver dr = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(dr, 5, 1);
        JavascriptExecutor js = (JavascriptExecutor) dr;
        dr.get("https://bt.rozetka.com.ua/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div[1]/rz-super-portal/div/main/section/div[2]/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[1]/img")));
        js.executeScript("window.scrollBy(0, 250)", "");
        Thread.sleep(2000);
        dr.quit();

    }

}
