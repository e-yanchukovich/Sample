package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;

        System.out.print("Введите размер массива больше 5 и меньше либо равно 10: ");

        boolean flag = false;

        do {
            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();
            } else {
                scanner.next();
                System.out.print("Неправильный ввод. Введите верное число: ");
                continue;
            }

            if (inputNumber > 5 && inputNumber <= 10) {
                break;
            } else {
                System.out.print("Неправильный ввод. Введите верное число: ");
            }
        }
        while (true);

        int[] m = new int[inputNumber];
        Random random = new Random();

        for (int i = 0; i<m.length; i++) {
            m[i] = random.nextInt();
        }

        int[] bufM = new int[inputNumber];
        int count = 0;
        for (int i : m) {
            if (i%2 == 0) {
                bufM[count] = i;
                count++;
            }
        }

        int[] m1 = Arrays.copyOf(bufM, count);

        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(m1));
    }
}
