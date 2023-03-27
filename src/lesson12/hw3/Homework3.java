package lesson12.hw3;

import java.util.*;

/*
    Сгенерировать List чисел,
    подсчитать количество повторений.
 */

public class Homework3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add((int) (Math.random() * 5));
        }

        System.out.println(list);

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        System.out.println(map);

        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result += entry.getValue() - 1;
        }

        System.out.println(result);
    }
}
