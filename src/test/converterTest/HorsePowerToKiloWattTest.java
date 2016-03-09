package converterTest;

import converter.Converter;
import converter.HorsePowerToKiloWatt;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class HorsePowerToKiloWattTest extends Assert {
    private Double multiplier;
    private Double horsePower;

    @Before
    public void setUp() {
        multiplier = 0.7355;
        horsePower = 123.0;
    }

    @Test
    public void test() {
        Double kiloWatt = horsePower * multiplier;
        assertEquals(90.4665, kiloWatt, 0.001);
    }

    @Test
    public void methodTest() {
        Converter horsePowerToKiloWatt = new HorsePowerToKiloWatt();
        Double kiloWatt = horsePowerToKiloWatt.convert(horsePower);
        assertEquals(90.4665, kiloWatt, 0.001);
    }
}
