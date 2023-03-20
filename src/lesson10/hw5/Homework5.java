package lesson10.hw5;

public class Homework5 {

    public static void main(String[] args) {

        String str = "Hello";
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            sb.append(ch).append(ch);
        }

        System.out.println(sb);

    }
}
