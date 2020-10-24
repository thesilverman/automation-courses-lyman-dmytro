package homeworks.homework10;

import java.util.HashMap;
import java.util.Map;

public class TestTest2 {

    public static void main(String[] args) {

        Map<TestTest, String> map = new HashMap<>();

        TestTest key1 = new TestTest("first", 1);
        TestTest key2 = new TestTest("second", 2);
        TestTest key3 = new TestTest("third", 3);
        TestTest key4 = new TestTest("fourth", 4);
        TestTest key5 = new TestTest("fifth", 5);
        TestTest key6 = new TestTest("six", 6);
        TestTest key7 = new TestTest("seventh", 7);
        TestTest key8 = new TestTest("eight", 8);


        map.put(key1, "first");
        map.put(key2, "second");
        map.put(key3, "third");
        map.put(key4, "fourth");
        map.put(key5, "fifth");
        map.put(key6, "six");
        map.put(key7, "seventh");
        map.put(key8, "eight");



    }

}
