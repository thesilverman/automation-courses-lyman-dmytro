package homeworks.Infrastructure.wdm;


import homeworks.Infrastructure.wdm.capabilities.PlatformCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloudWebDriverFactory implements WebDriverFactory {
public class CloudWebDriverFactory implements WebDriverFactory {
    DesiredCapabilities plat = new DesiredCapabilities();

    @Override
    public WebDriver create() {
        WebDriver cloudDriver = null;

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                plat.merge(PlatformCapabilities.chromeCapabilities());
                break;
            case FIREFOX:
                plat.merge(PlatformCapabilities.firefoxCapabilities());
                break;
            default:
                throw new IllegalArgumentException(String.format("unable to create driver with type %s", testBrowser));
        }

        try {
            cloudDriver = new CloudWebDriverFactory(new URL(ConfigurationManager.getInstance().getCloudUrl()), plat);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return cloudDriver;
     return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
        }
        return null;
    }
}
