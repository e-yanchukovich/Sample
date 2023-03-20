package lesson10.cw2;

import java.util.Scanner;

public class Classwork2 {

    public static void main(String[] args) {

        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ", -1);

        int sum = 0;
        for (String s : arr) {
            sum += s.length();
        }

        double avarageLen = (double)sum / arr.length;

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            if (s.length() > avarageLen) {
                sb.append(s).append(" ");
            }
        }

        System.out.println(sb);
    }
}
