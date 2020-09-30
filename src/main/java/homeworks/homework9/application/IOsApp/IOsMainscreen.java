package homeworks.homework9.application.IOsApp;

import homeworks.homework9.application.Mainscreen;

public class IOsMainscreen implements Mainscreen {

    @Override
    public void checkPet() {
        System.out.println("--> IOs check details of last feeding");
    }

    @Override
    public void addFood() {
        System.out.println("--> IOs add food");
        System.out.println("--> IOs add water");
    }



}
