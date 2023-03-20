package lesson10.cw1;

import java.util.Scanner;

public class Classwork1 {

    public static void main(String[] args) {

        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ", -1);

        int minLen = arr[0].length();
        int maxLen = arr[0].length();
        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < minLen) {
                minLen = arr[i].length();
                minPos = i;
            } else if (arr[i].length() > maxLen) {
                maxLen = arr[i].length();
                maxPos = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr[minPos]).append(":").append(minLen).append(" ").append(arr[maxPos]).append(":").append(maxLen);
        System.out.println(sb);
    }
}
