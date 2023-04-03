package lesson14.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockBuffer<T> {

    private final List<T> buffer;
    int maxSize;

    ReentrantLock lock;

    public ReentrantLockBuffer(int size) {
        maxSize = size;
        buffer = new ArrayList<>(size);
        lock = new ReentrantLock();
    }

    public T get() {

        T retVal;

        lock.lock();
        try {
            retVal = buffer.get(buffer.size() - 1);
            buffer.remove(buffer.size());
        } finally {
            lock.unlock();
        }
        return retVal;
    }

    public boolean put(T elem) {
        if (buffer.size() == maxSize) {
            return false;
        } else {
            lock.lock();
            try {
                buffer.add(elem);
            } finally {
                lock.unlock();
            }
        }

        return true;
    }
}
