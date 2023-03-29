package lesson13.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Homework2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 15 + 5));
        }

        System.out.println(list);

        System.out.println(list.stream().collect(Collectors.toSet()));
        System.out.println(list.stream().filter(x -> x >= 7 && x <= 17 && x % 2 == 0).collect(Collectors.toList()));
        System.out.println(list.stream().map(x -> x * 2).collect(Collectors.toList()));
        System.out.println(list.stream().sorted().limit(4).collect(Collectors.toList()));
        System.out.println(list.stream().count());
        System.out.println((float) list.stream().reduce(Integer::sum).get() / list.size());

    }
}
