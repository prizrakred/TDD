package converterTest;

import converter.Converter;
import converter.MileToKiloMeter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 11.03.2016.
 */
public class MileToKiloMeterTest extends Assert {
    private Double multiplier;
    private Double mile;

    @Before
    public void setUp() {
        multiplier = 1.609344;
        mile = 20.41;
    }

    @Test
    public void test() {
        Double kilometer = mile * multiplier;
        assertEquals(32.846711, kilometer, 0.001);
    }

    @Test
    public void methodTest() {
        Converter mileToKiloMeter = new MileToKiloMeter();
        Double kilometer = mileToKiloMeter.convert(mile);
        assertEquals(32.846711, kilometer, 0.001);
    }
}
