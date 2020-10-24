package homeworks.homework9.application.AndroidApp;

import homeworks.homework9.application.Application;
import homeworks.homework9.application.StatisticScreen;

public class AndroidApplication implements Application {

    @Override
    public AndroidAddEditScreen getAddEditScreen() {
        return new AndroidAddEditScreen();
    }

    @Override
    public AndroidLoginScreen getLoginScreen() {
        return new AndroidLoginScreen();
    }

    @Override
    public AndroidMainscreen getMainScreen() {
        return new AndroidMainscreen();
    }

    @Override
    public AndroidStatisticScreen getStatisticScreen() {
        return new AndroidStatisticScreen();
    }
}
