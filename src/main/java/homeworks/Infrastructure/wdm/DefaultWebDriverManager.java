package homeworks.Infrastructure.wdm;

import org.openqa.selenium.WebDriver;

public class DefaultWebDriverManager implements WebDriverManager{

        WebDriverFactory factory;

    public WebDriver getBrowser(RunOn run){
        RunOn runOn = ConfigurationManager.getInstance().getRunOn();
        switch (runOn){
            case CLOUD:
                factory = new CloudWebDriverFactory();
            case LOCAL:
                factory = new LocalWebDriverFactory();
            case REMOTE:
                factory = new RemoteWebDriverFactory();
            default:
                return factory.create();
        }
    }

    @Override
    public WebDriver getDriver() {
        return null;

}

    @Override
    public void destroyDriver(WebDriver driver) {
        if (driver != null){
            driver.quit();
        }
    }
}
