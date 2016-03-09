package converter;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class CelsiusToFahrenheit implements Converter {
    @Override
    public Double convert(Double toConvert) {
        return toConvert * 1.8 + 32;
    }
}
