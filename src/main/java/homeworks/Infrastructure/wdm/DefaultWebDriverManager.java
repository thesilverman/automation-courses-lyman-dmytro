package homeworks.Infrastructure.wdm;

import org.openqa.selenium.WebDriver;

public class DefaultWebDriverManager implements WebDriverManager{

    @Override
    public WebDriver getDriver() {
        String runOn = ConfigurationManager.getInstance().getRunOn();
        WebDriverFactory factory;
        switch (runOn) {
            case "local":
                factory = new LocalWebDriverFactory();
                break;
            case "remote":
                factory = new RemoteWebDriverFactory();
                break;
            case "cloud":
                factory = new CloudWebDriverFactory();
                break;
            default:
                factory = new LocalWebDriverFactory();
        }
        return factory.create();
    }

    @Override
    public String getBrowser() {
        return null;
    }

    @Override
    public void destroyBrowser(WebDriver driver) {
        if(driver != null){
            driver.quit();
        }
    }
}
