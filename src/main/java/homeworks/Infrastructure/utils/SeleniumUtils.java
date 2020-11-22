package homeworks.Infrastructure.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

    private static String parentWindow;

    public static void switchToWindowByTitle(WebDriver driver, String title){
        parentWindow = driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }

    public static void switchToWindowByUrl(WebDriver driver, String url){
        parentWindow = driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getCurrentUrl().equals(url)){
                break;
            }
        }
    }

    public static void switchToWindowByWindow(WebDriver driver){
        driver.switchTo().window(parentWindow);
    }

}
