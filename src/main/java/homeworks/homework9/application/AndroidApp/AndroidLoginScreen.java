package homeworks.homework9.application.AndroidApp;

import homeworks.homework9.application.LoginScreen;

public class AndroidLoginScreen implements LoginScreen {

    @Override
    public void login() {
        System.out.println("--> android fill login");
        System.out.println("--> android fill password");
        System.out.println("--> android submit login form");
    }

    @Override
    public void register() {

    }

    @Override
    public void restorePassword() {

    }
}
