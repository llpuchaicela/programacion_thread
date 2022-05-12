package Semana3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter2 {
    // utilizando un candado
    private static int count = 0;
    private Lock counterLock;
    public Counter2() {
        counterLock = new ReentrantLock();
    }
    public void increment() {
        counterLock.lock();
        try {
            //otra forma de mandar a dormir a un hilo
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        // encierra en un try la condicion critica

        try {
            count++;
        } finally {
            counterLock.unlock();
        }
    }
    public int getCount() {
        return count;
    }
}
