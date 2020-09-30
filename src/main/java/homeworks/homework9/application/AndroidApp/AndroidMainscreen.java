package homeworks.homework9.application.AndroidApp;

import homeworks.homework9.application.Mainscreen;

public class AndroidMainscreen implements Mainscreen {

    @Override
    public void checkPet() {
        System.out.println("--> android check details of last feeding");
    }

    @Override
    public void addFood() {
        System.out.println("--> android add food");
        System.out.println("--> android add water");
    }



}
