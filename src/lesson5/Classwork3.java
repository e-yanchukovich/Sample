package lesson5;

public class Classwork3 {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        double res = 0;

        System.out.println("Массив: ");

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.random() * 100;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            res += arr[arr.length - i - 1][i];
        }

        System.out.println("\nСумма элементов побочной диагонали: " + res);
    }
}
