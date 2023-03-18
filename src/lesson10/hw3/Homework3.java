package lesson10.hw3;

public class Homework3 {

    public static void main(String[] args) {

        String str = "fffff ab f 1234 jkjk";

        String[] arr = str.split(" ", -1);

        int resultPos = 0;
        int minLen = charCount(arr[0]);

        for (int i=1;i<arr.length;i++) {
            int len = charCount(arr[i]);
            if (len < minLen) {
                resultPos = i;
                minLen = len;
            }
        }

        System.out.println(arr[resultPos]);

    }

    private static int charCount(String str) {

        char[] chars = new char[str.length()];
        int charCount = 0;

        for (char ch : str.toCharArray()) {
            if (!contains(chars, charCount, ch)) {
                chars[charCount] = ch;
                charCount++;
            }
        }

        return charCount;
    }

    private static boolean contains(char[] arr, int charCount, char ch) {
        for (int i = 0; i < charCount; i++) {
            if (arr[i] == ch) {
                return true;
            }
        }
        return false;
    }
}
