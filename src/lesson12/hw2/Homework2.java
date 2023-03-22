package lesson12.hw2;

/*
    Напишите программу, которая принимает массив целых чисел
    и находит все пары чисел, сумма которых равна заданному числу.
    Используйте HashMap для хранения чисел и их индексов в массиве,
    где ключ - число, а значение - его индекс. (Доп)
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Homework2 {

    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 8, 9, 4, 6, 3, 5, 5};
        int num = 10;

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == num - arr[i]) {
                    map.put(arr[i], arr[j]);
                    break;
                }
            }
        }

        System.out.println(map);

    }
}
