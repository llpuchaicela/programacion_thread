package PoolExecuteListaV2Ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RunTasPrimeEj2V2 {
    public static void main(String[] args) throws InterruptedException {
        var nums = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11);
        List<PrimeTaskEj2V2> threads = new ArrayList<>();
        var numCores = Runtime.getRuntime().availableProcessors();
        CountDownLatch endController = new CountDownLatch(nums.size());
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);

        for (var num : nums) {
            PrimeTaskEj2V2 primeTaskEj2V2 = new PrimeTaskEj2V2(num, endController);
            threads.add(primeTaskEj2V2);
            executor.execute(primeTaskEj2V2);
        }
        endController.await();
        System.out.println("fin");
        System.out.println("Hay " + threads.stream().filter(PrimeTaskEj2V2::isPrime).count() + " numeros primos en la lista");
        executor.shutdown();
    }

}


