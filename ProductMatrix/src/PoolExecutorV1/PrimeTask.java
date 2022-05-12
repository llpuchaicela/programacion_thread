package PoolExecutorV1;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class PrimeTask implements Runnable {
    private int number;
    public PrimeTask(int number) {
        this.number = number;
    }
    @Override
    public void run() {
    // anymatch si 1 cumple la condicion
        if (IntStream.range(2, number).anyMatch(i -> number % i == 0)) {
            System.out.printf("%d NO es primo \n", number);
        } else {
            System.out.printf("%d ES primo \n", number);
        }
    }
}