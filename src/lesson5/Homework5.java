package lesson5;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        System.out.println("\nИсходный массив:");

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(arr[i]));
            Arrays.sort(arr[i]);
        }

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i <arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
