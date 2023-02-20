package lesson2;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №4");

        Scanner scanner = new Scanner(System.in);
        double outdoorTemperature = 0;

        System.out.print("Введите температуру за бортом (дробная часть через запятую): ");
        outdoorTemperature = scanner.nextDouble();
        System.out.println(outdoorTemperature);
        if (outdoorTemperature > -5d) {
            System.out.println("Тепло");
        } else if (outdoorTemperature > -20d) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
