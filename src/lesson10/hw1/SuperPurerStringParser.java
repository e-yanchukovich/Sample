package lesson10.hw1;

import org.apache.commons.lang3.StringUtils;

public class SuperPurerStringParser {

    public static String firstTwoBlocks(String str) {
        String[] arr = str.split("-", -1);
        return arr[0] + " " + arr[2];
    }

    public static String replaceYYYtostars(String str) {
        String[] arr = str.split("-", -1);

        arr[1] = arr[3] = "***";

        return StringUtils.join(arr, "-");
    }

    public static String onlyLetters(String str) {
        String[] arr = str.split("-", -1);

        return arr[1] + "/" + arr[3] + "/" + arr[4].charAt(1) + "/" + arr[4].charAt(3);
    }

    public static String letters(String str) {
        String[] arr = str.split("-", -1);

        StringBuilder sb = new StringBuilder("\"Letters:");

        sb.append(arr[1].toUpperCase())
                .append("/")
                .append(arr[3].toUpperCase())
                .append("/")
                .append(arr[4].toUpperCase().charAt(1))
                .append("/")
                .append(arr[4].toUpperCase().charAt(3))
                .append("\"");

        return sb.toString();
    }

    public static boolean isContainsABC(String str) {

        return str.toLowerCase().contains("abc");
    }

    public static boolean isStartsWith555(String str) {

        return str.startsWith("555");
    }

    public static boolean isEndsWith1A2B(String str) {

        return str.endsWith("1a2b");
    }

}
