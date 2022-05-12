package ProgramaSecuencialParaleloPares;

import java.util.List;

public class CtrlNumberPar {
    public static void main(String[] args) {
        //Paralela
        //Declara lista
        var numbers = List.of(3, 1, 12, 8, 10);
        for (int i : numbers) {
            //Crea los hilos por cada posicion, presenta 5 hilos
            //Cuando es implements Runable es obligatorio mandar un objeto dentro del hilo
            Thread numpar = new Thread(new NumberImplem(i));
            numpar.start();

        }
    }
}
