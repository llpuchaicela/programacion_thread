package Semana3;

public class Counter_sincro {
    private int count;
    // es parecida al candado
    public synchronized void increment(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException ie){}
        count ++;
    }
    public  int getCount(){
        return count;
    }
}
