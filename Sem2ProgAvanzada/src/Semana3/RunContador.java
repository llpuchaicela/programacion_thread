package Semana3;

import java.util.concurrent.atomic.AtomicInteger;

public class RunContador {
    /*
    DATA RACE CONDITION --PROBLEMA CONTADOR
    // solo tenemos el hilo main
    public static void main(String[] args) {
        //utilizar una variable atomica
        var contador = new contador();
        for (var i = 0; i < 10; i++) {
            new Thread(() -> {

                //llama al metodo de clase contador
                contador.increment();
                //Imprime 10 hilos del 0 al 9
                System.out.printf("%d para hilo %s%n", contador.getCount(), Thread.currentThread().getName());
            }).start();
        }
    }
}
*/

/*
    // SIN DATA RACE -- SOLUCION CONTADOR
    // con variable atomica
    public static void main(String[] args) {
        //utilizar una variable atomica
        var contador = new AtomicInteger();
        for (var i = 0; i < 10; i++) {
            new Thread(() -> {
                //llama al metodo de clase contador
                contador.incrementAndGet();
                //Imprime 10 hilos del 0 al 9
                System.out.printf("%d para hilo %s%n", contador.get(), Thread.currentThread().getName());
            }).start();
        }
    }
}

*/

    /*

    // SOLUCION CON CANDADO
    public static void main(String[] args) {
        //utilizar una variable atomica
        var Counter2 = new Counter2();
        for (var i = 0; i < 10; i++) {
            new Thread(() -> {

                //llama al metodo de clase contador
                Counter2.increment();
                //Imprime 10 hilos del 0 al 9
                System.out.printf("%d para hilo %s%n", Counter2.getCount(), Thread.currentThread().getName());
            }).start();
        }
    }
}
*/

    // SOLUCION CON syncronizado
    public static void main(String[] args) {
        //utilizar una variable atomica
        var CounterSin = new Counter_sincro();
        for (var i = 0; i < 10; i++) {
            new Thread(() -> {
                //llama al metodo de clase contador
                CounterSin.increment();
                //Imprime 10 hilos del 0 al 9
                System.out.printf("%d para hilo %s%n", CounterSin.getCount(), Thread.currentThread().getName());
            }).start();
        }
    }
}