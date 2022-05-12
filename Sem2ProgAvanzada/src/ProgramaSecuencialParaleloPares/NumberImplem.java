package ProgramaSecuencialParaleloPares;

public class NumberImplem implements Runnable {
    /*
    Paralela
    implementa Runnable
    Recibe un parametro number y en el constructor envio el valor
    al atributo number
    */
    int number;

    public NumberImplem(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        if (number % 2 == 0) {
            System.out.println(String.format("%s el numero es par ", number));
        }
    }
}
