package lesson13.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Homework3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Вася");
        list.add("Петя");
        list.add("Маша");
        list.add("Вася");
        list.add("Афоня");
        list.add("Вася");

        String myName = "Вася".toLowerCase();
        System.out.println(list.stream().map(String::toLowerCase).filter(x -> x.equals(myName)).count());
        System.out.println(list.stream().map(String::toLowerCase).filter(x -> x.startsWith("а")).collect(Collectors.toList()));

        Optional<String> firstElement = list.stream().sorted().findFirst();
        if (firstElement.isPresent()) {
            System.out.println(firstElement.get());
        } else {
            System.out.println("Empty");
        }
    }
}
