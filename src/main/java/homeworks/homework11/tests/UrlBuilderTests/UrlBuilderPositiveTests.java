package homeworks.homework11.tests.UrlBuilderTests;

import homeworks.homework10.TestUrl;
import org.junit.Assert;
import org.junit.Test;

public class UrlBuilderPositiveTests {
    TestUrl.Builder testUrl = new TestUrl.Builder();

    @Test
    public void urlBuilder(){
        String expectedUrl = "http://google.com.ua:80?/search?param=param";
        String actualUrl = testUrl.withProtocol("http://")
                .withDomain("google.com.ua")
                .withPort("80")
                .withPath("/search")
                .withParam("param", "param")
                .build();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}
