package lesson8;

import lesson8.hw1.Figure;
import lesson8.hw1.Rectangle;
import lesson8.hw1.Triangle;
import lesson8.hw1.Circle;

public class Homework1 {
    public static void main(String[] args) {
        Figure[] arr = new Figure[5];

        arr[0] = new Rectangle(5, 10);
        arr[1] = new Circle(3);
        arr[2] = new Triangle(3);
        arr[3] = new Triangle(3, 4);
        arr[4] = new Triangle(2,3,4);

        double sum = 0;

        for (Figure i : arr) {
            sum += i.perimeter();
            System.out.println(i.perimeter() + "  " + i.square());
        }

        System.out.println("Результат: " + sum);
    }
}
