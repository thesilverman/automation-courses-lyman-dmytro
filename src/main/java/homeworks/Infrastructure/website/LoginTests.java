package homeworks.Infrastructure.website;

public class LoginTests extends AuthTest {

    public void beforeTest(){
        beforeAuth();
        logger.log("fill login");
    }

    public void loginTest(){
        beforeAuth();
        logger.log("fill login");
        logger.log("fill password");
        logger.log("submit login form");
        logger.log("check is logged in");
    }

}
