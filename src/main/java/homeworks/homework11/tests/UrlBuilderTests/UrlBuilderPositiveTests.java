package homeworks.homework11.tests.UrlBuilderTests;

import homeworks.homework10.TestUrl;
import org.junit.Assert;
import org.junit.Test;

public class UrlBuilderPositiveTests {
    TestUrl.Builder testUrl = new TestUrl.Builder();

    @Test
    public void urlBuilder(){
        String expectedUrl = "http://google.com.ua:80?/search?third=third&first=first&second=second";
        String actualUrl = testUrl.withProtocol("wfwefwef").build();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}
