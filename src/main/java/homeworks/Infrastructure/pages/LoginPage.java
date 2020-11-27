package homeworks.Infrastructure.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class LoginPage {
    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;

    @FindBy(id = "login_error")
    private WebElement errorMassage;

    @FindBy(xpath = "//*[@id=\"wp-submit\"]")
    private WebElement buttonLogin;

    @FindBy(id = "user_login")
    private WebElement loginField;

    @FindBy(id = "user_pass")
    private WebElement passField;

    @FindBy(xpath = "//*[@id=\"login\"]/p[1]")
    private WebElement massageLoginOut;

    public LoginPage(WebDriver driver, JavascriptExecutor js) {
        this.driver = driver;
        this.js = js;
        wait = new WebDriverWait(driver, 5, 1);
        PageFactory.initElements(driver, this);
    }

    public LoginPage populateLoginField(String name) {
        loginField.sendKeys(name);
        return this;
    }

    public LoginPage populatePassField(String pass) {
        passField.sendKeys(pass);
        return this;
    }

    public AdminPage populateClickButton() {
        buttonLogin.click();
        return new AdminPage(driver);
    }

    public LoginPage populateClickButtonFail() {
        buttonLogin.click();
        return this;
    }

    public void verifyLoginErrorMassage() {
        assertEquals("Unknown username. Check again or try your email address.", errorMassage.getText());
    }

    public void verifyPasswordErrorMassage() {
        assertEquals("Error: The password you entered for the username admin is incorrect. Lost your password?", errorMassage.getText());
    }

    public void verifyErrorMassageLoginPass() {
        assertEquals("Error: The username field is empty.\n" +
                "Error: The password field is empty.", errorMassage.getText());
    }

    public void massageAcceptLoginOut() {
        wait.until(ExpectedConditions.urlContains("wp-login.php?loggedout=true&wp_lang=en_US"));
        assertEquals("You are now logged out.", massageLoginOut.getText());
    }
}
