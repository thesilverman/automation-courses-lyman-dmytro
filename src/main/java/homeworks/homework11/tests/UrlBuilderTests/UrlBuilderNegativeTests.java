package homeworks.homework11.tests.UrlBuilderTests;

import homeworks.homework10.TestUrl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UrlBuilderNegativeTests {

    public TestUrl url;
    @Rule
    public ExpectedException ex = ExpectedException.none();

    @Test
    public void Url(){
        url = new TestUrl();
        ex.expectMessage("Your domain name is empty ");
        ex.expect(IllegalArgumentException.class);

        String actualUrl = "http://google.com.ua:80?/search?param=param";
        String expectedUrl = new TestUrl.Builder().withProtocol("http://")
                .withDomain("")
                .withPort("80")
                .withPath("/search")
                .withParam("param", "param")
                .build();
    }

}
