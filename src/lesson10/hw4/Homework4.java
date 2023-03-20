package lesson10.hw4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        String str = "abba aabb baba aaBbaa";
        String[] arr = str.split(" ", -1);

        Scanner scanner = new Scanner(System.in);

        int strNum = -1;

        System.out.print("String number: ");

        if (scanner.hasNextInt()) {
            strNum = scanner.nextInt();
            strNum--;
        }

        if (strNum >= arr.length || strNum < 0) {
            System.out.println("Error");
            return;
        }

        System.out.println(checkPolindrom(arr[strNum]));


    }

    private static boolean checkPolindrom(String str) {

        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
