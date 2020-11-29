package homeworks.Infrastructure.wdm;

import homeworks.Infrastructure.wdm.capabilities.BrowserCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RemoteWebDriverFactory implements WebDriverFactory {

public class RemoteWebDriverFactory implements WebDriverFactory {
    DesiredCapabilities caps = new DesiredCapabilities();

    @Override
    public WebDriver create() {
        WebDriver driver = null;

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                caps.merge(BrowserCapabilities.chromeCapabilities());
                break;
            case FIREFOX:
                caps.merge(BrowserCapabilities.fireFoxCapabilities());
                break;
            default:
                throw new IllegalArgumentException(String.format("unable to create driver with type %s", testBrowser));
        }

        try {
            driver = new RemoteWebDriver(new URL(ConfigurationManager.getInstance().getRemoteHubUrl()), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
        }
        return driver;
    }
}