package lesson10.hw2;

public class Homework2 {

    public static void main(String[] args) {

        String str = "as fvfmv ld sdfbdfb";

        String[] arr = str.split(" ", -1);

        int minLen = arr[0].length();
        int maxLen = arr[0].length();
        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() <= minLen) {
                minLen = arr[i].length();
                minPos = i;
            } else if (arr[i].length() >= maxLen) {
                maxLen = arr[i].length();
                maxPos = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr[minPos]).append(":").append(minLen).append(" ").append(arr[maxPos]).append(":").append(maxLen);
        System.out.println(sb);
    }
}
