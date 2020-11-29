package homeworks.Infrastructure.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    @FindBy(xpath = "//*[@id=\"meta-2\"]/ul/li[1]/a")
            private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"post-1\"]/header/div/a")
    private WebElement searchPostClick;

    @FindBy(xpath = "//*[@id=\"search-form-1\"]")
    private WebElement searchStroke;

    @FindBy(xpath = "//*[@id=\"search-2\"]/form/button")
    private WebElement linkSearch;

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;

    public MainPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
        this.driver = driver;
        this.wait = wait;
        this.js = js;
        PageFactory.initElements(driver, this);
    }

    public MainPage openMainPage(String url){
        driver.get("http://testautomationcuorses.iblogger.org/wordpress/");
        return this;
    }

    public LoginPage navigateToLoginPage(){
        loginButton.click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
        return new LoginPage(driver, js);
    }

    public PostPage navigatePostPage(){
        searchPostClick.click();
        wait.until(ExpectedConditions.urlContains("/2020/11/07/hello-world/"));
        return new PostPage(driver, wait);
    }

    public void searchPositiveChek(){
        searchStroke.click();
        searchStroke.sendKeys("Hello World");
        linkSearch.click();
    }

}
