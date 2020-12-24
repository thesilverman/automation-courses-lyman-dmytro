package homeworks.Infrastructure.wdm;

public enum BrowserType {

    CHROME("google"),
    FIREFOX("firefox"),
    IE("ie"),
    SAFARI("safari"),
    OPERA("opera");

    private final String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }

}
