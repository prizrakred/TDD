package converterTest;

import converter.Converter;
import converter.PoundToKiloGram;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 11.03.2016.
 */
public class PoundToKiloGramTest extends Assert {
    private Double multiplier;
    private Double pound;

    @Before
    public void setUp() {
        multiplier = 0.4536;
        pound = 31.245;
    }

    @Test
    public void test() {
        Double kilogram = pound * multiplier;
        assertEquals(14.172732, kilogram, 0.001);
    }

    @Test
    public void methodTest() {
        Converter poundToKiloGram = new PoundToKiloGram();
        Double kilogram = poundToKiloGram.convert(pound);
        assertEquals(14.172732, kilogram, 0.001);
    }
}
