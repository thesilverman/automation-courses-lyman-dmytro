package homeworks.homework11.tests.StringUtilsTests;

import homeworks.Infrastructure.utils.RandomStringGenerator;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsPositiveTests {

    RandomStringGenerator ram = new RandomStringGenerator();

    @Test
    public void StringGeneratorTestsAlfa(){
        int expectedLength = 10;
        String actual = ram.stringGenerator(RandomStringGenerator.TypeEnum.ALPHA, 10);
        Assert.assertEquals(expectedLength, actual.length());
        for (String e: actual.split("")){
            Assert.assertThat(ram.str, CoreMatchers.containsString(e));
        }
    }

    @Test
    public void StringGeneratorTestsNum(){
        int expectedLength = 10;
        String actual = ram.stringGenerator(RandomStringGenerator.TypeEnum.NUMERIC, 10);
        Assert.assertEquals(expectedLength, actual.length());
        for (String e: actual.split("")){
            Assert.assertThat(ram.str, CoreMatchers.containsString(e));
        }
    }
}
