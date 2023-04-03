package lesson14.hw2;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBuffer<T> {

    private final List<T> buffer;
    int maxSize;

    public SynchronizedBuffer(int size) {
        maxSize = size;
        buffer = new ArrayList<>(size);
    }

    public T get() {

        T retVal;

        synchronized (buffer) {
            retVal = buffer.get(buffer.size() - 1);
            buffer.remove(buffer.size() - 1);
        }

        return retVal;
    }

    public boolean put(T elem) {
        if (buffer.size() == maxSize) {
            return false;
        } else {
            synchronized (buffer) {
                buffer.add(elem);
            }
            return true;
        }
    }
}