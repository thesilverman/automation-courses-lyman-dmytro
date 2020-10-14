package homeworks.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    @Override
    public String makeJob() {
        return developer.makeJob() + sendReport();
    }

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendReport() {
        return " send weekly report to customer ";
    }

}
