package homeworks.Infrastructure;

public class TestServer {

    public String getUrl() {
        String testEnviroment = ConfigurationManager.getInstance().getTestEnvironment();


        switch (testEnviroment) {
            case "qa_env":
                return "http://qa.env.mysite.com";
            case "prod_env":
                return "http://prod.env.mysite.com";
            case "standing_env":
                return "http://standing.env.mysite.com";
            default:
                return "";
        }
    }

}
