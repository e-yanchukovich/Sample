package lesson2;

public class Classwork2 {

    public static void main(String[] args) {
        System.out.println("Задание №2");

        int i = 10;
        int sum = 0;
        while (i < 55) {
            sum += i;
            i += 2;
        }
        System.out.println("Сумма четных чисел от 10 до 55 равна " + sum);
    }
}
