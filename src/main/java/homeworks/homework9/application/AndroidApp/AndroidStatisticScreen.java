package homeworks.homework9.application.AndroidApp;

import homeworks.homework9.application.StatisticScreen;

public class AndroidStatisticScreen implements StatisticScreen {

    @Override
    public void checkFeeding() {
        System.out.println("--> android checkFeeding");
    }

    @Override
    public void viewGraph() {
        System.out.println("--> android viewGraph");
    }

    public void backButton(){
        System.out.println("--> android back to main screen");
    }

}
