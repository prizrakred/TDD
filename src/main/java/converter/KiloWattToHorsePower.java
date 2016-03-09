package converter;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class KiloWattToHorsePower implements Converter {
    @Override
    public Double convert(Double toConvert) {
        return toConvert / 0.7355;
    }
}
