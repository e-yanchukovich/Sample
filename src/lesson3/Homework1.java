package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int[] m = new int[] {1, 3, 4, 8, 10, 15, 20};


        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;

        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            inputNumber = scanner.nextInt();
        }
        else {
            System.out.println("Неверный ввод");
            return;
        }

        int[] bufM = new int[m.length];
        int count = 0;
        for (int i : m) {
            if (i != inputNumber) {
                bufM[count] = i;
                count++;
            }
        }

        int[] m1 = Arrays.copyOf(bufM, count);

        if (count == m.length) {
            System.out.println("Число " + inputNumber + " не входит в массив");
        } else {
            System.out.println("Новый массив: " + Arrays.toString(m1));
        }
    }
}
