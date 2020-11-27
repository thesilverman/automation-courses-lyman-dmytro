package homeworks.Infrastructure.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class PostPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"post-1\"]/header/h1")
    private WebElement checkTestPostPage;

    @FindBy(id = "comment")
    private WebElement textAreaComment;

    @FindBy(id = "author")
    private WebElement inputAreaAuthorPostPage;

    @FindBy(id = "email")
    private WebElement inputEmailPostPage;

    @FindBy(id = "url")
    private WebElement inputUrlPostPage;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    private WebElement submitButtonPostPage;

    @FindBy(xpath = "//div[@class=\"comment-content\"]")
    private WebElement checkVisiblePost;

    public PostPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public PostPage commendFieldPostPage(){
        textAreaComment.click();
        textAreaComment.sendKeys("comment for this page");
        inputAreaAuthorPostPage.click();
        inputAreaAuthorPostPage.sendKeys("Dima");
        inputEmailPostPage.click();
        inputEmailPostPage.sendKeys("thesilverman2@gmail.com");
        inputUrlPostPage.click();
        inputUrlPostPage.sendKeys("http://testautomationcuorses.iblogger.org/");
        submitButtonPostPage.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new PostPage(driver, wait);
    }

    public void verifyVisiblePost() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals("comment for this page", checkVisiblePost.getText());
    }
}
