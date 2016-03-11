package converterTest;

import converter.Converter;
import converter.KiloMeterToMile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 11.03.2016.
 */
public class KiloMeterToMileTest extends Assert {
    private Double divider;
    private Double kilometer;

    @Before
    public void setUp() {
        divider = 1.609344;
        kilometer = 16.52;
    }

    @Test
    public void test() {
        Double mile = kilometer / divider;
        assertEquals(10.265052, mile, 0.001);
    }

    @Test
    public void methodTest() {
        Converter kiloMeterToMile = new KiloMeterToMile();
        Double mile = kiloMeterToMile.convert(kilometer);
        assertEquals(10.265052, mile, 0.001);
    }
}
