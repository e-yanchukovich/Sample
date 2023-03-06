package lesson7.cw2;

public class BaseConverter {
    public static double convertCtoK(double temp) {
        return temp + 273.15;
    }

    public static double convertKtoC(double temp) {
        return temp - 273.15;
    }

    public static double convertCtoF(double temp) {
        return 1.8 * temp + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) / 1.8;
    }
}
