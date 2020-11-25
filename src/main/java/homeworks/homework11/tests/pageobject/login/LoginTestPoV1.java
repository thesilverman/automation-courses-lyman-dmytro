package homeworks.homework11.tests.pageobject.login;

import homeworks.Infrastructure.base.TestBase;
import homeworks.Infrastructure.pages.MainPage;
import org.junit.Test;

public class LoginTestPoV1 extends TestBase {

    @Test
    public void PositiveTestLoginIn() {
        MainPage mainPage = new MainPage(driver, wait, js);
        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage()
                .populateLoginField("admin")
                .populatePassField("admin")
                .populateClickButton()
                .verifyUserLoginIn();
    }

    @Test
    public void NegativeTestLoginErrorMessage(){
        MainPage mainPage = new MainPage(driver, wait, js);
        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage()
                .populateLoginField("admin1111")
                .populatePassField("admin")
                .populateClickButtonFail()
                .verifyLoginErrorMassage();
    }

    @Test
    public void NegativeTestPasswordErrorMessage(){
        MainPage mainPage = new MainPage(driver, wait, js);
        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage()
                .populateLoginField("admin")
                .populatePassField("admin1111")
                .populateClickButtonFail()
                .verifyPasswordErrorMassage();
    }

    @Test
    public void NegativeTestLoginPasswordMessageError(){
        MainPage mainPage = new MainPage(driver, wait, js);
        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage()
                .populateClickButtonFail()
                .verifyErrorMassageLoginPass();
    }

    @Test
    public void PositiveTestLoginOut(){
        MainPage mainPage = new MainPage(driver, wait, js);
        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage()
                .populateLoginField("admin")
                .populatePassField("admin")
                .populateClickButton()
                .exitAdminPage()
                .massageAcceptLoginOut();
    }

    @Test
    public void PositiveTestCheckPost() throws InterruptedException {
        MainPage mainPage = new MainPage(driver, wait, js);
        mainPage.openMainPage(server.getUrl())
                .navigatePostPage()
                .commendFieldPostPage()
                .verifyVisiblePost();
    }

}
