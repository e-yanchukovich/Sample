package lesson5;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {

        int[] arr = new int[20];
        int firstEl = 0;
        int elCount = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        int sum = arr[0];
        int sumBuf = sum;

        int currentElCount = 1;
        int currentFirstEl = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sumBuf += arr[i];
                currentElCount++;
            } else {
                if (sumBuf > sum) {
                    firstEl = currentFirstEl;
                    elCount = currentElCount;
                    sum = sumBuf;
                }

                sumBuf = arr[i];
                currentElCount = 1;
                currentFirstEl = i;
            }
        }

        if (sumBuf > sum) {
            firstEl = currentFirstEl;
            elCount = currentElCount;
            sum = sumBuf;
        }

        System.out.println();
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, firstEl, firstEl + elCount)));
    }
}
