package homeworks.homework11.tests.testMySite;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;

public class AutoTestingMySiteLogin extends LoginPrecondition{

    private void populateLoginFormatSubmit(String name, String pass){
        js.executeScript(String.format("document.getElementById('user_login').value='%s'", name));
        js.executeScript(String.format("document.getElementById('user_pass').value='%s'", pass));
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")));
    }

    @Test
    public void PositiveTestLoginIn() {
        populateLoginFormatSubmit("admin", "admin");
        wait.until(ExpectedConditions.urlContains("/wp-admin/"));
        js.executeScript("window.scrollBy(0,1000)");
        String actualLoginMessage = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]")).getText();
        assertEquals("Howdy, admin", actualLoginMessage);
    }

    @Test
    public void NegativeTestPasswordErrorMessage(){
        populateLoginFormatSubmit("admin", "");
        String actualTestMessageError = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The password field is empty.", actualTestMessageError);
    }

    @Test
    public void NegativeTestLoginErrorMessage(){
        populateLoginFormatSubmit("", "admin");
        String actualTestMessageError = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The username field is empty.", actualTestMessageError);
    }

    @Test
    public void NegativeTestLoginPasswordMessageError(){
        populateLoginFormatSubmit("", "");
        String actualMessageErrorLoginPassword = driver.findElement(By.id("login_error")).getText();
        assertEquals("Error: The username field is empty.\n" +
                "Error: The password field is empty.", actualMessageErrorLoginPassword);
    }

    @Test
    public void PositiveTestLoginOut(){
        populateLoginFormatSubmit("admin", "admin");
        wait.until(ExpectedConditions.urlContains("wp-admin"));
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-logout\"]/a")).click();
        if(wait.until(ExpectedConditions.urlContains("action=logout&_wpnonce=7efd665929"))){
            driver.findElement(By.id("//*[@id=\"reload-button\"]")).click();
        }else
        wait.until(ExpectedConditions.urlContains("/wordpress/wp-login.php?loggedout=true&wp_lang=en_US"));
        String actualMessageLogOut = driver.findElement(By.xpath("//*[@id=\"login\"]/p[1]")).getText();
        assertEquals("You are now logged out.", actualMessageLogOut);
    }
}
