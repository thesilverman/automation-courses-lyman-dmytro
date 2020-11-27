package homeworks.Infrastructure.website; 

public class TestSuite {
    public static void main(String[] args) {
        LoginTests test1 = new LoginTests();
        test1.beforeTest();
        test1.loginTest();

        RegisterTests test2 = new RegisterTests();
        test2.beforeTest();
        test2.loginTest();
    }
}
