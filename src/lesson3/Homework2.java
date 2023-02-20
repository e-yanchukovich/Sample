package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int masLength = 0;

        System.out.print("Введите размер массива: ");
        if (scanner.hasNextInt()) {
            masLength = scanner.nextInt();
        }
        else {
            System.out.println("Неверный ввод");
            return;
        }


        double[] m = new double[masLength];

        for (int i = 1; i < m.length; i++) {
            m[i] = Math.random() * 100;
        }

        System.out.println("Массив: " + Arrays.toString(m));

        double avarVal = m[0];
        double maxVal = m[0];
        double minVal = m[0];

        for (int i = 1; i < m.length; i++) {
            if (m[i] > maxVal) {
                maxVal = m[i];
            } else if (m[i] < minVal) {
                minVal = m[i];
            }

            avarVal += m[i];
        }

        avarVal /= m.length;

        System.out.println("Максимальное значени: " + maxVal);
        System.out.println("Минимальное значение: " + minVal);
        System.out.println("Среднее значение: " + avarVal);

    }
}
