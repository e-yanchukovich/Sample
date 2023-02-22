package lesson5;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int arr1[][] = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int arr2[][] = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int resN = 0;

        if (arr1.length == arr2[0].length) {
            resN = arr1.length;
        } else {
            System.out.println("Матрицы не совместимы");
            return;
        }

        int res[][] = new int[resN][resN];

        for (int i = 0; i < resN; i++) {
            for (int j = 0; j < resN; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nРезультат:");
        for (int i = 0; i <res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
