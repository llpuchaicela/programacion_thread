package semana2;

public class HelloThread extends Thread {

    @Override
    public void run() {
        String  helloMess = String.format("Hola, soy %s\n ", Thread.currentThread().getName());
        System.out.println(helloMess);

    }

}
