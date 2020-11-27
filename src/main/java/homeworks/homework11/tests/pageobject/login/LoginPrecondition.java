package homeworks.homework11.tests.pageobject.login;

import homeworks.Infrastructure.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPrecondition extends TestBase {
    @Override
    public void beforeTest() {
        super.beforeTest();
        openMainPage();
        navigateToLoginPage();
    }

    public void navigateToLoginPage(){
        wait.until(ExpectedConditions.urlContains("wordpress/?i=1"));
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a"));
        driver.findElement(By.xpath("//*[@id=\"meta-2\"]/ul/li[1]/a")).click();
        wait.until(ExpectedConditions.urlContains("wp-login.php"));
    }

    public void openMainPage(){
        driver.get(server.getUrl());
    }
}
