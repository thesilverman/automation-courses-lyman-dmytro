package homeworks.Infrastructure.data;

public class UserNotFoundExсeption extends IllegalArgumentException{

    public UserNotFoundExсeption(String s) {
        super(s);
    }
}
