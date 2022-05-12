package Semana3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class DeadLockExample {
    private  Lock lock1 = new ReentrantLock((true);
    private Lock lock2 = new ReentrantLock((true);

    public static void main(String[] args) {
        DeadLockExample deadLock = new DeadLockExample();
        new Thread(deadLock):: operation1, "[1]".start();
        new Thread(deadLock):: operation2, "[2]".start();
    }
    public void operation1() throws InterruptedException {

        lock1.lock();
        System.out.println("Lock1 adquirido, esperacon adquirir loack2");
        sleep(50);

    }

    public void operation2() throws InterruptedException {

        lock1.lock();
        System.out.println("Lock1 adquirido, esperacon adquirir loack2");
        sleep(50);
         lock2.lock();;
         print("lock2 adquirido");
         print("lock")

    }
}
