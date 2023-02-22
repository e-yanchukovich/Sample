package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Введите число: ");
        do {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt(8);
                break;
            } else {
                scanner.next();
                System.out.print("Неправильный ввод. Введите верное число: ");
            }
        }
        while (true);

        System.out.println("\nИсходный массив:");

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = (int) (Math.random() * 100);
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Модифицированный массив:");

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += number;
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}