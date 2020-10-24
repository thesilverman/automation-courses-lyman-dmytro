package homeworks.homework10;

public class BuilderSuite {

    public static void main(String[] args) {

        new TestUrl.Builder().withProtocol("http://")
                .withDomain("google.com.ua")
                .withPort("80")
                .withPath("/search")
                .params()
                .withParam()
                .build();

    }

}
