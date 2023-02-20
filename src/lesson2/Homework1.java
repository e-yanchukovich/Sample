package lesson2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №1");

        Scanner scanner = new Scanner(System.in);
        int mounthNumber = 0;

        System.out.print("Введите номер месяца от 1 до 12: ");
        mounthNumber = scanner.nextInt();
        switch (mounthNumber) {
            case 3:
            case 4:
            case 5: {
                System.out.println("Весна");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Лето");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Осень");
                break;
            }
            case 12:
            case 1:
            case 2: {
                System.out.println("Зима");
                break;
            }
            default: {
                System.out.println("Неправильный номер месяца");
            }
        }
    }
}
