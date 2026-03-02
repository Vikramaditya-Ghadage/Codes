import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private final ReentrantLock lock = new ReentrantLock();
    private int value = 0;

    public void outerMethod() {
        lock.lock();
        try {
            value += 1;
            System.out.println("Outer: " + value);
            innerMethod();  // Same thread re-acquires lock
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            value += 10;
            System.out.println("Inner: " + value);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockDemo demo = new ReentrantLockDemo();
        demo.outerMethod();  // Prints: Outer: 1, Inner: 11
    }
}

