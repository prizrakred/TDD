package main;

import converter.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitriik on 09.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-config.xml");
        InformationGenerator informationGenerator = ctx.getBean(InformationGenerator.class);
        Converter celsiusToFahrenheit = ctx.getBean(CelsiusToFahrenheit.class);
        Converter fahrenhetToCelsius = ctx.getBean(FahrenhetToCelsius.class);
        Converter horsePowerToKiloWatt = ctx.getBean(HorsePowerToKiloWatt.class);
        Converter kiloWattToHorsePower = ctx.getBean(KiloWattToHorsePower.class);
        int n = 10;
        for (int i = 0; i < n; i++) {
            ValueType valueType = informationGenerator.getValueType();
            Double value = informationGenerator.getValue();
            switch (valueType) {
                case CELSIUS:
                    Double fahrenfeit = celsiusToFahrenheit.convert(value);
                    System.out.println(ValueType.CELSIUS + ": " + value + "; " + ValueType.FAHRENHEIT + ": " + fahrenfeit);
                    break;
                case FAHRENHEIT:
                    Double celsius = fahrenhetToCelsius.convert(value);
                    System.out.println(ValueType.FAHRENHEIT + ": " + value + "; " + ValueType.CELSIUS + ": " + celsius);
                    break;
                case HORSE_POWER:
                    Double kiloWatt = horsePowerToKiloWatt.convert(value);
                    System.out.println(ValueType.HORSE_POWER + ": " + value + "; " + ValueType.KILO_WATT + ": " + kiloWatt);
                    break;
                case KILO_WATT:
                    Double horsePower = kiloWattToHorsePower.convert(value);
                    System.out.println(ValueType.KILO_WATT + ": " + value + "; " + ValueType.HORSE_POWER + ": " + horsePower);
                    break;
                default:
                    break;
            }
        }
        ctx.close();
    }
}
