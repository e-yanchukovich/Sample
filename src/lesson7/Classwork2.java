package lesson7;

import lesson7.cw2.BaseConverter;

public class Classwork2 {

    public static void main(String[] args) {
        System.out.println("100 C -> " + BaseConverter.convertCtoF(100) + " F");
        System.out.println("212 F -> " + BaseConverter.convertFtoC(212) + " C");
        System.out.println("100 C -> " + BaseConverter.convertCtoK(100) + " K");
        System.out.println("373.15 K -> " + BaseConverter.convertKtoC(373.15) + " C");
    }
}
