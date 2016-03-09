package converterTest;

import converter.Converter;
import converter.KiloWattToHorsePower;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class KiloWattToHorsePowerTest extends Assert {
    private Double divider;
    private Double kiloWatt;

    @Before
    public void setUp() {
        divider = 0.7355;
        kiloWatt = 211.0;
    }

    @Test
    public void test() {
        Double horsePower = kiloWatt / divider;
        assertEquals(286.87967, horsePower, 0.001);
    }

    @Test
    public void methodTest() {
        Converter kiloWattToHorsePower = new KiloWattToHorsePower();
        Double horsePower = kiloWattToHorsePower.convert(kiloWatt);
        assertEquals(286.87967, horsePower, 0.001);
    }
}
