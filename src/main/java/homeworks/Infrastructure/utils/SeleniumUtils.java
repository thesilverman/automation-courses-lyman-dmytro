package homeworks.Infrastructure.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class SeleniumUtils {

    private static String parentWindow;
    WebDriver dr;

    public SeleniumUtils(WebDriver dr) {
        this.dr = dr;
    }

    public void switchToWindowByTitle(WebDriver driver, String title){
        parentWindow = driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getTitle().equals(title)){
                break;
            }
        }
    }

    public void switchToWindowByUrl(WebDriver driver, String url){
        parentWindow = driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getCurrentUrl().equals(url)){
                break;
            }
        }
    }

    public void switchToWindowByWindow(WebDriver driver){
        driver.switchTo().window(parentWindow);
    }

    public void makeScreenShotWholePage(WebDriver driver, String name){
        Screenshot scrShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(scrShot.getImage(), "PNG",  new File(System.getProperty("user.dir") + "/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
    }

}
}
