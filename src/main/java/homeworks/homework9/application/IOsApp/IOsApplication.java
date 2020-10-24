package homeworks.homework9.application.IOsApp;

import homeworks.homework9.application.Application;

public class IOsApplication implements Application {

    @Override
    public IOsAddEditScreen getAddEditScreen() {
        return new IOsAddEditScreen();
    }

    @Override
    public IOsLoginScreen getLoginScreen() {
        return new IOsLoginScreen();
    }

    @Override
    public IOsMainscreen getMainScreen() {
        return new IOsMainscreen();
    }

    @Override
    public IOsStatisticScreen getStatisticScreen() {
        return new IOsStatisticScreen();
    }
}
