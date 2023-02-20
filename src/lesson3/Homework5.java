package lesson3;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        double[] m = new double[] {1.5, 50.6, 4.1, 111.5, 10.5};

        System.out.println(Arrays.toString(m));

        for (int i = 1; i < m.length; i += 2) {
            m[i] = 0;
        }

        System.out.println(Arrays.toString(m));
    }
}
