package lesson3;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        double[] m1 = new double[] {1.5, 50.6, 4.1, 111.5, 10.5};
        double[] m2 = new double[] {10.1, 1.2, 8.4, 6.9, 333.7};

        System.out.println("Первый массив: " + Arrays.toString(m1));
        System.out.println("Второй массив: " + Arrays.toString(m2));

        double m1Avr = 0;
        double m2Avr = 0;

        for (double i : m1) {
            m1Avr += i;
        }
        m1Avr /= m1.length;

        for (double i : m2) {
            m2Avr += i;
        }
        m2Avr /= m2.length;

        if (m1Avr > m2Avr) {
            System.out.println("Среднее арифметическое значение элементов ПЕРВОГО массиво больше");
        } else if (m2Avr > m1Avr) {
            System.out.println("Среднее арифметическое значение элементов ВТОРОГО массиво больше");
        } else {
            System.out.println("Среднее афифметическое значение элементов массивов равно");
        }
    }
}
