package homeworks.Infrastructure.website;

import homeworks.Infrastructure.TestBase;

public class LoginTests extends AuthTest {

    public void loginTest(){
        beforeAuth();
        logger.Log("fill login");
        logger.Log("fill password");
        logger.Log("submit login form");
        logger.Log("check is logged in");
    }

}
