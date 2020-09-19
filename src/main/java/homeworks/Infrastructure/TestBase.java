package homeworks.Infrastructure;

public class TestBase {

    private WebDriverManager wdn;
    protected Exersise_2_Test_Logger logger;
    private String browser;

    public void setup(){
        wdn = new WebDriverManager();
        logger = new Exersise_2_Test_Logger();
        browser = wdn.createBrowser();
    }

    public void tearDown(){
        wdn.destroyBrowser(browser);
    }

}
