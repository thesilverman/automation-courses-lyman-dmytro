package homeworks.Infrastructure.wdm;

public interface WebDriverManager {

    String getBrowser();

    void destroyBrowser(String browser);

}
