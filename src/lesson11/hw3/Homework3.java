package lesson11.hw3;

public class Homework3 {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.get());
        System.out.println(queue.get());
        queue.add(4);
        System.out.println(queue.get());
        System.out.println(queue.isEmpty());
        System.out.println(queue.get());
        System.out.println(queue.isEmpty());

    }
}
