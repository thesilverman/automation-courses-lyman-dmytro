package homeworks.homework11.tests.UrlBuilderTests;

import homeworks.homework10.TestUrl;
import org.junit.Test;

public class UrlBuilderPositiveTests {
    private TestUrl.Builder testUrl;

    @Test
    public void urlBuilder(){
        testUrl = new TestUrl.Builder();
        TestUrl.Builder expectUrl = new TestUrl.Builder().withProtocol("");
    }

}
