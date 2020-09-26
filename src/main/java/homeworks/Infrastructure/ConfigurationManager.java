package homeworks.Infrastructure;

public class ConfiguratiomManager {

    private static ConfiguratiomManager instance;

    private ConfiguratiomManager() {

    }

    public static ConfiguratiomManager getInstance() {
        if (instance == null) {
            instance = new ConfiguratiomManager();
        }
        return instance;
    }

    public String getEnvinromentVariableOrDefault(String envVar, String defaultValue) {
        String currentVarValue = System.getenv(envVar);
        return currentVarValue == null || currentVarValue.isEmpty() ?
                defaultValue :
                currentVarValue;
    }

    public String getTestBrowser(){
        return getEnvinromentVariableOrDefault("browser", "chrome");
    }

    public String getTestEnvironment(){
        return getEnvinromentVariableOrDefault("environment", "qa_env");
    }

}
