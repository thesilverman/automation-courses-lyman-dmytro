package homeworks.Infrastructure;

import homeworks.Infrastructure.wdm.ConfigurationManager;

public class TestServer {

    public String getUrl() {
        String testEnviroment = ConfigurationManager.getInstance().getTestEnvironment();
        switch (testEnviroment) {
            case "qa_env":
                return "http://testautomationcuorses.iblogger.org/wordpress/";
            case "prod_env":
                return "http://prod.env.mysite.com";
            case "standing_env":
                return "http://standing.env.mysite.com";
            default:
                return "";
        }
    }

}
