package homeworks.loginExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupWindow {

//    @Test
//    public void exampleTest(){
//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
//        ChromeOptions opt = new ChromeOptions();
//        opt.merge(dc);
//        WebDriver dr = new ChromeDriver(opt);
//        dr.get("http://demoga.com/alerts");
//        dr.findElement(By.xpath("//button[@id='alertButton']")).click();
//        dr.findElement(By.xpath("//div[contains(text(), 'Elements')]")).click();
//    }
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PopupWindow {

    @Test
    public void exampleTest(){
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        ChromeOptions opt = new ChromeOptions();
        opt.merge(dc);
        WebDriver dr = new ChromeDriver(opt);
        dr.get("http://demoga.com/alerts");
        dr.findElement(By.xpath("//button[@id='alertButton']")).click();
        dr.findElement(By.xpath("//div[contains(text(), 'Elements')]")).click();
    }

    @Test
    public void iframeTest(){
        
    }

}
