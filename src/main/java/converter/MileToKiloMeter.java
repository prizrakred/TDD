package converter;

/**
 * Created by dmitriik on 11.03.2016.
 */
public class MileToKiloMeter implements Converter {
    @Override
    public Double convert(Double toConvert) {
        return toConvert * 1.609344;
    }
}
