package converter;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class HorsePowerToKiloWatt implements Converter {
    @Override
    public Double convert(Double toConvert) {
        return 0.7355 * toConvert;
    }
}
