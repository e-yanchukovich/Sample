package lesson3;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {

        int[] m = new int[] {10, 55, 666, 21, 72, 5, 17, 8, 1};

        int buf = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {
                if (m[j] > m[j + 1]) {
                    buf = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = buf;
                }
            }
        }

        System.out.println(Arrays.toString(m));
    }
}
