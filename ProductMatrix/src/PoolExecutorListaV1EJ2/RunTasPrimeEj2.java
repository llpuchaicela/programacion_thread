package PoolExecutorListaV1EJ2;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class RunTasPrimeEj2 {
    public static void main(String[] args) throws InterruptedException {
        var nums = List.of(2,3,4,5,6,7,8,9,11);
        List<PrimeTaskEj2> threads = new ArrayList<>();

        for (var num : nums) {
            PrimeTaskEj2 primeTaskEj2 = new PrimeTaskEj2(num);
            primeTaskEj2.start();
            threads.add(primeTaskEj2);
        }
        waitingThreads(threads);
        System.out.println("fin");
        System.out.println("Hay "+ threads.stream().filter(PrimeTaskEj2::isPrime).count()+ " numeros primos en la lista");
    }


    private static void waitingThreads(List<PrimeTaskEj2> threads) throws InterruptedException{
        for (var t : threads) {
            t.join();
        }
    }
}


