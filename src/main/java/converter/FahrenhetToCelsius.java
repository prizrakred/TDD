package converter;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class FahrenhetToCelsius implements Converter {
    @Override
    public Double convert(Double toConvert) {
        return (toConvert - 32) * 5.0 / 9.0;
    }
}
