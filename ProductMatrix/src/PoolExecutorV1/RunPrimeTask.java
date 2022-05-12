package PoolExecutorV1;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RunPrimeTask {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11);

        // en hilo como se hacia antes por cada elemento se crea un hilo
        for (var num : nums) {
            Thread t = new Thread(new PrimeTask(num));
            t.start();
        }
    }
}

