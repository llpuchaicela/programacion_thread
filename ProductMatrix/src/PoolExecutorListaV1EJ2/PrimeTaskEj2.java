package PoolExecutorListaV1EJ2;

import java.util.stream.IntStream;

public class PrimeTaskEj2 extends Thread{

private int number;
private boolean isPrime;

    public PrimeTaskEj2(int number) {
        this.number = number;
    }

    public void run(){
        // si alguno cumple la condicion se guarda en isPrime
        isPrime = IntStream.range(2,number).noneMatch(div-> number % div ==0);
    }
    // metodo get
    public boolean isPrime(){
        return isPrime;
    }
}
