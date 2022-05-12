package semana2;

public class CtrlHelloThread {
    public static void main(String[] args) {
        // extends Thread

        HelloThread ht = new HelloThread();
        ht.start();


        // implements Thread
        //Thread thRunable = new Thread(new InterfaceRunnable());
        //thRunable.start();
    }
}
