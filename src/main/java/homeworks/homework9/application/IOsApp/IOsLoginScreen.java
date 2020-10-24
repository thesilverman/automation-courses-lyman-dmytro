package homeworks.homework9.application.IOsApp;

import homeworks.homework9.application.LoginScreen;

public class IOsLoginScreen implements LoginScreen {

    @Override
    public void login() {
        System.out.println("--> IOs fill login");
        System.out.println("--> IOS fill password");
        System.out.println("--> IOS submit login form");
    }

    @Override
    public void register() {

    }

    @Override
    public void restorePassword() {

    }
}
