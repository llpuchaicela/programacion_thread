package PoolExecutorV2;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class PrimeTask implements Runnable {
    private int number;
    private CountDownLatch endController;

    public PrimeTask(int number, CountDownLatch endController) {
        this.number = number;
        this.endController = endController;
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