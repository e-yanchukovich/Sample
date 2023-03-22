package lesson11.hw3;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue<T> {

    Deque<T> current;
    Deque<T> tmp;

    public MyQueue() {
        current = new ArrayDeque<>();
        tmp = new ArrayDeque<>();
    }

    public void add(T x) {
        current.push(x);
        System.out.println(current + "    " + tmp);
    }

    public T get() {
        if (!tmp.isEmpty()) {
            return tmp.pop();
        }
        while (!current.isEmpty()) {
            tmp.push(current.pop());
        }
        System.out.println(current + "    " + tmp);
        return tmp.pop();
    }

    public boolean isEmpty() {
        if (!tmp.isEmpty()) {
            return false;
        }
        return current.isEmpty();
    }
}