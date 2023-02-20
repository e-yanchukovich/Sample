package lesson2;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №8");

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        System.out.print("Введите целое положительное число: ");
        number = scanner.nextInt();

        if (number > 0) {
            for (int i=1; i<=number; i++) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
    }
}
