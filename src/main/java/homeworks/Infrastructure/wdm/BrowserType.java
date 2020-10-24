package homeworks.Infrastructure.wdm;

public enum BrowserType {

    CHROME("google"),
    FIREFOX("firefox");

    private final String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }

}
