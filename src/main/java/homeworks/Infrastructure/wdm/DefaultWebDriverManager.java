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

                return factory.create();
                factory = new LocalWebDriverFactory();
        }
        return factory.create();
    }

    @Override
    public WebDriver getDriver() {
        return null;
    }

    @Override
    public void destroyDriver(WebDriver driver) {
        if (driver != null){
    public void destroyBrowser(WebDriver driver) {
        if(driver != null){
            driver.quit();
        }
    }
}
