package lesson5;

public class Homework3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int res = 0;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                res += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма элементов массива: " + res);
    }
}
