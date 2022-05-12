package PoolExecutorV2;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Run2TaskPrime {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11);

        var numCores = Runtime.getRuntime().availableProcessors();
        // number.size = numero de tareas
        CountDownLatch endController = new CountDownLatch(nums.size());

        // numcores = numero de hilos
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(numCores);

        for (var num : nums) {
            executor.execute(new PrimeTask(num, endController));
        }
 // le decimo al main que espere hasta que todos terminen
        endController.await();
        System.out.println("FIN");
        executor.shutdown(); // Desaparece los hilos
    }


}
