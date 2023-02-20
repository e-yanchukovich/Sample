package lesson2;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №13");

        Scanner scanner = new Scanner(System.in);
        int mounthNumber = 0;
        float sum = 0;
        float sumFinal = 0;

        System.out.print("Введите сумму вклада: ");
        sum = scanner.nextFloat();

        sumFinal = sum;

        System.out.print("Введите срок вклада: ");
        mounthNumber = scanner.nextInt();

        for (int i=0; i<mounthNumber; i++) {
            sumFinal += sumFinal * 0.07;
        }

        System.out.println("Конечная сумма равна " + sumFinal);
    }
}
