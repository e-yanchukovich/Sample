package lesson2;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        System.out.println("Домашнее задание №3");

        Scanner scanner = new Scanner(System.in);

            int inputNumber = 0;
            System.out.print("Введите число: ");
            inputNumber = scanner.nextInt();

            if (inputNumber%2 == 0) {
                System.out.println(inputNumber + " это четное число");
            } else {
                System.out.println(inputNumber + " это нечетное число");
            }
    }
}
