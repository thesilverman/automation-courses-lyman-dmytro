package homeworks.Infrastructure.wdm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocalWebDriverFactory implements WebDriverFactory {

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();

            case IE:
                return new InternetExplorerDriver();
            case OPERA:
                return new OperaDriver();
            case SAFARI:
                return new SafariDriver();
            default:
                throw new IllegalArgumentException(String.format("unable to create driver with type %s", testBrowser));
        }
    }
}