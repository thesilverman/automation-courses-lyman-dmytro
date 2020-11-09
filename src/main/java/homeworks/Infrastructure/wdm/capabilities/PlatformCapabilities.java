package homeworks.Infrastructure.wdm.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PlatformCapabilities {

    public static Capabilities chromeCapabilities() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "86");
        chromeOptions.setCapability("platformName", "Windows 10");
        DesiredCapabilities desiredCapabilities =  new DesiredCapabilities();
        desiredCapabilities.merge(chromeOptions);
        return desiredCapabilities;

    }

    public static Capabilities firefoxCapabilities() {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("browser version", "82");
        firefoxOptions.setCapability("platform name", "Windows 10");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(firefoxOptions);
        return firefoxOptions;

    }
}
