package homeworks.homework11.tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static homeworks.homework11.tests.Convertor.ConvertorTypes.FROM_KILLOGRAMM_TO_GRAMM;

public class NegativeConverterTest extends BaseTest{
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void verifyNegativeConvertorValueTest(){
        System.out.println("negative test without rules ");
        Convertor app = new Convertor();
        float actualData = app.convert(FROM_KILLOGRAMM_TO_GRAMM, -50);
        System.out.println("negative test without rules ");
    }

    @Test
    public void verifyNegativeConvertorValueWithRules(){
        System.out.println("negative test without rules ");
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("value less then 0 not permitted");
        Convertor app = new Convertor();
        float actualData = app.convert(FROM_KILLOGRAMM_TO_GRAMM, -50);
        System.out.println("negative test with rules ");
    }

}
