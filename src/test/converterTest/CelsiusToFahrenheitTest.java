package converterTest;

import converter.CelsiusToFahrenheit;
import converter.Converter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class CelsiusToFahrenheitTest extends Assert {
    private Double multiplier;
    private Double difference;
    private Double celsiusTemperature;

    @Before
    public void setUp() {
        multiplier = 1.8;
        difference = 32.0;
        celsiusTemperature = 10.0;
    }

    @Test
    public void test() {
        Double fahreheitTemperature = celsiusTemperature * multiplier + difference;
        assertEquals(50.0, fahreheitTemperature, 0.001);
    }

    @Test
    public void methodTest() {
        Converter celsiusToFahrenheit = new CelsiusToFahrenheit();
        Double fahreheitTemperature = celsiusToFahrenheit.convert(celsiusTemperature);
        assertEquals(50.0, fahreheitTemperature, 0.001);
    }
}
