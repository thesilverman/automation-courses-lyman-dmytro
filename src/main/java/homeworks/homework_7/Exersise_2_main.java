package homeworks.homework_7;

public class Exersise_2_main {

    public static void main(String[] args) {

        Exersise_2_Test_Logger logger = new Exersise_2_Test_Logger();
        for (int i = 0; i < 10; i++) {
            System.out.println(logger.Log("operation " + i));
        }
    }

}
