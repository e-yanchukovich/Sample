package lesson10.cw3;

import java.util.Scanner;

public class Classwork3 {

    public static void main(String[] args) {

        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ", 3);

        StringBuilder sb = new StringBuilder();
        sb.append(arr[2]).append(" ").append(arr[1].toUpperCase()).append(" ").append(arr[0].toLowerCase());
        System.out.println(sb);
    }
}
