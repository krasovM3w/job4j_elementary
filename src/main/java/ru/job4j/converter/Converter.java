package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(600);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("600 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float inTwo = 450;
        float expectedTwo = 7.5F;
        float outTwo = Converter.rubleToDollar(inTwo);
        boolean result = expectedTwo == outTwo;
        System.out.println("450 rubles are 7.5 dollar's. Test result : " + result);

    }
}
