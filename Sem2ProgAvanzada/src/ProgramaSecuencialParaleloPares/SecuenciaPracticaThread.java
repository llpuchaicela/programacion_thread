package ProgramaSecuencialParaleloPares;

import java.util.List;
// Forma secuancial un valor tras otro
public class SecuenciaPracticaThread {
    public static void main(String[] args) {
        var numbers = List.of(3, 1, 12, 8, 10);
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(String.format("%s el numero es par ", i));
            }
        }
    }
}

