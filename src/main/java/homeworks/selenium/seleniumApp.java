package homeworks.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class seleniumApp {

    public static void main(String[] args) {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);

        ChromeOptions option = new ChromeOptions();
        option.merge(dc);

        WebDriver wd = new ChromeDriver();

        wd.get("http://google.com");
        wd.navigate().refresh();
        wd.navigate().to("http://rozetka.ua");
        WaitUtils.waitABit(5_000);
        System.out.println(wd.getCurrentUrl());
        System.out.println(wd.getTitle());
        wd.manage().window().fullscreen();
        WaitUtils.waitABit(5_000);
        wd.navigate().back();
        wd.navigate().forward();
        WaitUtils.waitABit(5_000);
        wd.manage().window().maximize();
        WaitUtils.waitABit(5_000);
        try {
            wd.navigate().to(new URL("http://moyo.ua"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        WaitUtils.waitABit(5_000);
        wd.manage().window().setSize(new Dimension(640, 480));
        WaitUtils.waitABit(5_000);
        wd.manage().window().setSize(new Dimension(1920, 1200));
        WaitUtils.waitABit(5_000);
        wd.quit();
    }

}
