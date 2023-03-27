package lesson13.hw1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        MyFunctionalInterface<String> fun1 = s -> new StringBuilder(s).reverse().toString();


        MyFunctionalInterface<Integer> fun2 = val -> {
            int result = 1;

            if (val > 2) {
                for (int i = 2; i <= val; i++) {
                    result *= i;
                }
            }

            return result;
        };


        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            switch (scan.nextInt()) {
                case 1 -> System.out.println(fun1.process("qwerty"));
                case 2 -> System.out.println(fun2.process(5));
            }
        }
    }
}
