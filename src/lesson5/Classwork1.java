package lesson5;

public class Classwork1 {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        double res = 0;

        System.out.println("Массив:");

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random() * 100;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        res = arr[0][0];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > res) {
                    res = arr[i][j];
                }
            }
        }

        System.out.println("\nМаксимальное значение: " + res);
    }
}
