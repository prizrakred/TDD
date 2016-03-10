package main;

import java.util.Random;

/**
 * Created by dmitriik on 10.03.2016.
 */
public class InformationGenerator {
    private Random random;

    private InformationGenerator() {
    }

    public InformationGenerator(Random random) {
        this.random = random;
    }

    public ValueType getValueType() {
        return ValueType.values()[random.nextInt(ValueType.values().length)];
    }

    public Double getValue() {
        return random.nextDouble() * 1000;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
