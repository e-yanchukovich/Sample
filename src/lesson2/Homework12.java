package lesson2;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №12");

        System.out.print("0 1 ");

        int prevPrevVal = 0;
        int prevVal = 1;

        int currentValue = 0;

        for (int i=2; i<11; i++) {

            currentValue = prevPrevVal + prevVal;
            System.out.print(currentValue + " ");

            prevPrevVal = prevVal;
            prevVal = currentValue;
        }
    }
}
