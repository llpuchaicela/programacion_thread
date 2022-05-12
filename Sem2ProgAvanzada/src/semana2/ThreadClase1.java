package semana2;
public class ThreadClase1 {
    public static void main(String[] args) {
        // Muestra el hilo principal main
        System.out.printf("%s - ejecutandose\n ", java.lang.Thread.currentThread().getName());
        for (var i=0; i<5; i++){
            new java.lang.Thread(()->{
                System.out.printf("%s - ejecutandose\n ", java.lang.Thread.currentThread().getName());
            }).start();
        }
        //System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.printf("Fin del %s\n ", java.lang.Thread.currentThread().getName());
    }
}
