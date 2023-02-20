package lesson2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        System.out.println("Домашнее задание №2");

        Scanner scanner = new Scanner(System.in);
        int mounthNumber = 0;

        System.out.print("Введите номер месяца от 1 до 12: ");
        mounthNumber = scanner.nextInt();

        if (mounthNumber >= 3 && mounthNumber <= 5) {
            System.out.println("Весна");
        } else if (mounthNumber >= 6 && mounthNumber <= 8) {
            System.out.println("Лето");
        } else if (mounthNumber >= 9 && mounthNumber <= 11) {
            System.out.println("Осень");
        } else if (mounthNumber == 12 || mounthNumber == 1 || mounthNumber == 2) {
            System.out.println("Зима");
        } else {
            System.out.println("Неправильный номер месяца");
        }
    }
}
