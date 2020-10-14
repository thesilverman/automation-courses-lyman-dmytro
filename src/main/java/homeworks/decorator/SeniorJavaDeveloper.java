package homeworks.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + makeCodeReview();
    }

    public String makeCodeReview() {
        return " make code review ";
    }

}
