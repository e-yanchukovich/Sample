package lesson3;

import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        int[] m = new int[] {1, 3, 4, 8, 10, 15, 20};

        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;

        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            inputNumber = scanner.nextInt();
        }
        else {
            System.out.println("Неверный ввод");
            return;
        }

        for (int i: m) {
            if (i == inputNumber) {
                System.out.println("Число " + inputNumber + " входит в массив");
                return;
            }
        }

        System.out.println("Число " + inputNumber + " не входит в массив");
    }
}
