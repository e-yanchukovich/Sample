package lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.println("Домашнее задание №2");
        System.out.print("Введите имя пользователя: ");
        userName = scanner.next();
        System.out.println("Hello " + userName);
    }
}
