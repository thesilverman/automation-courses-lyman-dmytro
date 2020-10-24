package homeworks.Infrastructure.wdm;

public enum RunOn {

    LOCAL("local"),
    REMOTE("remote"),
    CLOUD("cloud");

    private final String run;

    RunOn(String run){
        this.run = run;
    }
}
