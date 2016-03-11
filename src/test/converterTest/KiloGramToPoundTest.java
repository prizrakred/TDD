package converterTest;

import converter.Converter;
import converter.KiloGramToPound;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 11.03.2016.
 */
public class KiloGramToPoundTest extends Assert {
    private Double divider;
    private Double kiloGram;

    @Before
    public void setUp() {
        divider = 0.4536;
        kiloGram = 111.432;
    }

    @Test
    public void test() {
        Double pound = kiloGram / divider;
        assertEquals(245.661375, pound, 0.001);
    }

    @Test
    public void methodTest() {
        Converter kiloGramToPound = new KiloGramToPound();
        Double pound = kiloGramToPound.convert(kiloGram);
        assertEquals(245.661375, pound, 0.001);
    }
}
