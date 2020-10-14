package homeworks.decorator;

public class StartApp {

    public static void main(String[] args) {

        Developer dev = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(dev.makeJob());


    }

}
