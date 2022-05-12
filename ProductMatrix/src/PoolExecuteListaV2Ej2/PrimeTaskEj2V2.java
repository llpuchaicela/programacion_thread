package PoolExecuteListaV2Ej2;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class PrimeTaskEj2V2 implements Runnable {

    private int number;
    private boolean isPrime;
    private CountDownLatch endController;
    public PrimeTaskEj2V2(int number, CountDownLatch endController) {
        this.number = number;
        this.endController = endController;
    }

    public void run() {
        // si alguno cumple la condicion se guarda en isPrime
        isPrime = IntStream.range(2, number).noneMatch(div -> number % div == 0);
        endController.countDown();
    }

    // metodo get
    public boolean isPrime() {
        return isPrime;
    }
}
