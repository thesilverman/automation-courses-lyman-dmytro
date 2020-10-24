package homeworks.homework9.application.IOsApp;

import homeworks.homework9.application.StatisticScreen;

public class IOsStatisticScreen implements StatisticScreen {

    @Override
    public void checkFeeding() {
        System.out.println("--> IOs checkFeeding");
    }

    @Override
    public void viewGraph() {
        System.out.println("--> IOs viewGraph");
    }

    public void backButton(){
        System.out.println("--> IOs back to main screen");
    }

}
