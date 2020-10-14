package homeworks.Infrastructure.data;

import java.util.Arrays;

public class LessonApp {

    public static void main(String[] args) {

        FileDataMapper mapper = new FileDataMapper();
        System.out.println(Arrays.toString(mapper.getAll()));

    }

}
