package lesson14.hw1;

public class Homework1 {

    public static void main(String[] args) {
        Thread thread1 = new MyThread("T1");
        Thread thread2 = new MyThread("T2");
        Thread thread3 = new MyThread("T3");

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class MyThread extends Thread {

        public MyThread() {
        }

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println(getName());
        }
    }
}
