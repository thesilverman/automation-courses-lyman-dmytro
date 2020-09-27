package homeworks.Infrastructure.website; 

public class TestSuite {
    public static void main(String[] args) {
        LoginTests test1 = new LoginTests();
        test1.setup();
        test1.loginTest();
        test1.tearDown();

        RegisterTests test2 = new RegisterTests();
        test2.setup();
        test2.loginTest();
        test2.tearDown();
    }
}
