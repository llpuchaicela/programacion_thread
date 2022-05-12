package Semana3;

public class contador {
    private int count;
    public void increment(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException ie){}
        count ++;
    }
    public  int getCount(){
        return count;
    }
}
