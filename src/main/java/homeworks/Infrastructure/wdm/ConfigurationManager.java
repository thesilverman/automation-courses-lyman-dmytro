package homeworks.Infrastructure.wdm;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getEnvinromentVariableOrDefault(String envVar, String defaultValue) {
        String currentVarValue = System.getenv(envVar);
        return currentVarValue == null || currentVarValue.isEmpty() ?
                defaultValue :
                currentVarValue;
    }


    public BrowserType getTestBrowser(){
        return BrowserType.valueOf(getEnvinromentVariableOrDefault("browser", "chrome").toUpperCase());

    public String getTestBrowser(){
        return getEnvinromentVariableOrDefault("browser", "chrome");
    }

    public String getTestEnvironment(){
        return getEnvinromentVariableOrDefault("environment", "qa_env");
    }


    public RunOn getRunOn(){
        return RunOn.valueOf(getEnvinromentVariableOrDefault("runOn", "local"));

    public String getRunOn(){
        return getEnvinromentVariableOrDefault("runOn", "local");

    }

}
