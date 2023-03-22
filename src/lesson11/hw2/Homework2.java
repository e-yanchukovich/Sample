package lesson11.hw2;

import java.util.*;

public class Homework2 {

    public static void main(String[] args) {

        String str1 = "[]ab[_1]c25---!";
        String str2 = "[[a1]25]";
        String str3 = "[a1[25]";
        String str4 = "{}Map<Character, Character> map = new HashMap{<>()";

        System.out.println(isCorrect(str1));
        System.out.println(isCorrect(str2));
        System.out.println(isCorrect(str3));
        System.out.println(isCorrect(str4));
    }

    private static boolean isCorrect(String str) {

        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        map.put('<', '>');

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (map.containsValue(ch)) {
                if (stack.isEmpty() || !map.get(stack.pop()).equals(ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

