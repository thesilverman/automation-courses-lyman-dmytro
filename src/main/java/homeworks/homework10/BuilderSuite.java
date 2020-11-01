package homeworks.homework10;

import java.util.HashMap;

public class BuilderSuite {

    public static void main(String[] args) {


        HashMap<String, String> param = new HashMap<>();
        param.put("first", "first");
        param.put("second", "second");
        param.put("third", "third");

        System.out.println(new TestUrl.Builder().withProtocol("http://")
                .withDomain("google.com.ua")
                .withPort("80")
                .withPath("/search")
                .withParam(param)
                .build());


    }

}
