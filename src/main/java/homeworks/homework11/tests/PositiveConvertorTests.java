package homeworks.homework11.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static homeworks.homework11.tests.Convertor.ConvertorTypes.*;

@RunWith(Parameterized.class)
public class PositiveConvertorTests extends BaseTest{
    private Convertor app;
    private Convertor.ConvertorTypes type;
    private float expected;
    private int convertData;

    public PositiveConvertorTests(Convertor.ConvertorTypes type, int convertData, float expected) {
        this.type = type;
        this.convertData = convertData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection coverterData() {
        return Arrays.asList(new Object[][]{
                {FROM_KM_TO_L, 358, 42.95f},
                {FROM_KILLOGRAMM_TO_GRAMM, 1000, 1000000},
                {FROM_METERS_TO_KILOMETERS, 1000, 1}
        });
    }

    @Test
    public void testPositiveConventParameterized() {
        app = new Convertor();
        float actual = app.convert(type, convertData);
        Assert.assertEquals(expected, actual, 0.2);
        System.out.println("parametrized test with type " + type);
    }

}
