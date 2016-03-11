package converter;

/**
 * Created by dmitriik on 11.03.2016.
 */
public class PoundToKiloGram implements Converter {
    @Override
    public Double convert(Double toConvert) {
        return toConvert * 0.4536;
    }
}
