package semana2;

public class InterfaceRunnable implements Runnable{
    @Override
    //
    public void run() {
        String  helloMess = String.format("Hola, soy %s\n ", Thread.currentThread().getName());
        System.out.println(helloMess);

    }
}
