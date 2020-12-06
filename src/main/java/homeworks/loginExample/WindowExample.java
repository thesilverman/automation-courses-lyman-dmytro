package homeworks.loginExample;

import homeworks.Infrastructure.utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

    WebDriver dr = new ChromeDriver();

    @Test
    public void windowsSwitchTest(){
        dr.get("http://google.com");
        JavascriptExecutor js = (JavascriptExecutor) dr;
        js.executeScript("window.open('http://rozetka.ua')");
        js.executeScript("window.open('http://www.selenium.dev/')");
        SeleniumUtils su = new SeleniumUtils(dr);

        su.switchToWindowByTitle(dr, "Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине");
        System.out.println(dr.getTitle());
        System.out.println(dr.getCurrentUrl());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");

        su.switchToWindowByWindow(dr);
        System.out.println(dr.getTitle());
        System.out.println(dr.getCurrentUrl());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");

        su.switchToWindowByUrl(dr, "https://www.selenium.dev/");
        System.out.println(dr.getTitle());
        System.out.println(dr.getCurrentUrl());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");

        su.switchToWindowByWindow(dr);
        System.out.println(dr.getTitle());
        System.out.println(dr.getCurrentUrl());

        dr.getWindowHandles();
        for(String window: dr.getWindowHandles()){
            dr.switchTo().window(window);
            if(dr.getCurrentUrl().equals("http://www.selenium.dev/")){
                dr.findElement(By.xpath("//a[@href=\"/downloads\"]")).click();
                System.out.println(dr.getTitle());
            }
        }
        dr.quit();
    }

}
