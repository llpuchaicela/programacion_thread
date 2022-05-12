
package Demo02;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Random rd = new Random();
        int matriz[][] = new int[4][4];
        getMatriz(matriz, rd);
    }

    public static final int[][] getMatriz(int[][] matrizA, Random rd) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = rd.nextInt(1, 9);
            }
        }
        return matrizA;
    }
}
