package lesson12.hw1;

import java.util.HashMap;
import java.util.Map;

/*
    Напишите программу, которая принимает строку в качестве входных данных
    и подсчитывает, сколько раз каждый символ встречается в этой строке.
    Для хранения количества встреч символов используйте HashMap,
    где ключ - символ, а значение - количество встреч.
 */

public class Homework1 {

    public static void main(String[] args) {

        char[] chars;

        if (args.length > 0) {
            chars = args[0].toCharArray();
        } else {
            System.out.println("нет входного параметра");
            return;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        System.out.println(map);

    }
}
