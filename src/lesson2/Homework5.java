package lesson2;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №5");

        Scanner scanner = new Scanner(System.in);
        int colorNumber = 0;

        System.out.print("Введите цвет радуги : ");
        colorNumber = scanner.nextInt();

        switch (colorNumber) {
            case 1: {
                System.out.println("1 - красный цвет");
                break;
            }
            case 2: {
                System.out.println("2 - оранжевый цвет");
                break;
            }
            case 3: {
                System.out.println("3 - желтый цвет");
                break;
            }
            case 4: {
                System.out.println("4 - зеленый цвет");
                break;
            }
            case 5: {
                System.out.println("5 - голубой цвет");
                break;
            }
            case 6: {
                System.out.println("6 - синий цвет");
                break;
            }
            case 7: {
                System.out.println("7 - фиолетовый цвет");
                break;
            }
            default: {
                System.out.println("Ошибка ввода");
            }
        }
    }
}
