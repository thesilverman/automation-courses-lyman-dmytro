package homeworks.homework9.application;

import homeworks.homework9.application.AndroidApp.AndroidApplication;
import homeworks.homework9.application.IOsApp.IOsApplication;

public class LessonApp {

    public static void main(String[] args) {

        Application android = new AndroidApplication();
        android.getLoginScreen().login();
        android.getMainScreen().checkPet();
        android.getMainScreen().addFood();
        android.getAddEditScreen().fillPetForm();
        android.getAddEditScreen().savePet();
        android.getAddEditScreen().backButton();

        System.out.println("########################################");

        Application IOs = new IOsApplication();
        IOs.getLoginScreen().login();
        IOs.getMainScreen().checkPet();
        IOs.getMainScreen().addFood();
        IOs.getAddEditScreen().fillPetForm();
        IOs.getAddEditScreen().savePet();
        IOs.getAddEditScreen().backButton();

    }

}
