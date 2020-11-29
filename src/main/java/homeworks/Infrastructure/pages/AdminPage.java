package homeworks.Infrastructure.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class AdminPage {
    @FindBy(xpath = "//*[@id=\"wp-admin-bar-my-account\"]/a")
    private WebElement loginMassage;

    @FindBy(xpath = "//*[@id=\"wp-admin-bar-my-account\"]/a")
    private WebElement hoverPopUpAdminLogin;

    @FindBy(xpath = "//*[@id=\"wp-admin-bar-logout\"]/a")
    private WebElement buttonLogOut;

    @FindBy(xpath = "//*[@id=\"menu-comments\"]/a/div[3]")
    private WebElement clickComments;

    @FindBy(xpath = "//*[@id=\"comment-8\"]/td[2]")
    private WebElement blockCommentsView;

    @FindBy(xpath = "//*[@id=\"comment-8\"]/td[2]/div[3]/span[1]/a")
    private WebElement buttonUnapprove;

    @FindBy(xpath = "//*[@id=\"cb-select-all-1\"]")
    private WebElement clickCheckboxPost;

    @FindBy(xpath = "//*[@id=\"bulk-action-selector-bottom\"]")
    private WebElement clickPopupMenuTrash;

    @FindBy(xpath = "//*[@id=\"bulk-action-selector-bottom\"]/option[5]")
    private WebElement clickTrash;

    @FindBy(xpath = "//*[@id=\"doaction2\"]")
    private WebElement buttonApply;

    @FindBy(xpath = "//*[@id=\"wp-admin-bar-site-name\"]/a")
    private WebElement backToMainPage;

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Actions act;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 1);
        js = (JavascriptExecutor) driver;
        act = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyUserLoginIn() {
        wait.until(ExpectedConditions.urlContains("/wp-admin/"));
        assertEquals("Howdy, admin", loginMassage.getText());
    }

    public LoginPage exitAdminPage(){
        act.moveToElement(hoverPopUpAdminLogin).perform();
        buttonLogOut.click();
        return new LoginPage(driver, js);
    }

    public MainPage clickLinkCommentPage() {
        clickComments.click();
        clickCheckboxPost.click();
        clickPopupMenuTrash.click();
        clickTrash.click();
        buttonApply.click();
        backToMainPage.click();
        return new MainPage(driver, wait, js);
    }
}
