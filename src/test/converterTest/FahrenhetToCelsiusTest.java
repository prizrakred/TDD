package converterTest;

import converter.Converter;
import converter.FahrenhetToCelsius;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class FahrenhetToCelsiusTest extends Assert {
    private Double multiplier;
    private Double difference;
    private Double fahrenheitTemperature;

    @Before
    public void setUp() {
        multiplier = 5.0 / 9.0;
        difference = 32.0;
        fahrenheitTemperature = 50.0;
    }

    @Test
    public void test() {
        Double celsiusTemperature = (fahrenheitTemperature - difference) * multiplier;
        assertEquals(10, celsiusTemperature, 0.001);
    }

    @Test
    public void methodTest() {
        Converter fahrenhetToCelsius = new FahrenhetToCelsius();
        Double celsiusTemperature = fahrenhetToCelsius.convert(fahrenheitTemperature);
        assertEquals(10, celsiusTemperature, 0.001);
    }
}
