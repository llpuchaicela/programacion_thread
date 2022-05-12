package Demo02;

public class MatrizSecuencial {
    public static void main(String[] args) {
        int[][] matriz = {
                {20, 12, 77},
                {50, 12, 89},
                {10, 44, 15},
        };
        presentarMatriz(matriz);
        int sum = sumarMatriz(matriz);
        System.out.println("\nLa suma de todos los elementos de la matriz es: " + sum);
    }


    public static void presentarMatriz(int matrizA[][]) {
        System.out.println("\nLA MATRIZ ES:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++)
                System.out.print(matrizA[i][j] + "\t");
            System.out.println("");
        }
    }

    public static int sumarMatriz(int matrizA[][]) {
        int sum = 0;
        for (int x = 0; x < matrizA.length; x++) {
            for (int y = 0; y < matrizA[x].length; y++) {
                sum = matrizA[x][y] + sum;
            }
        }
        return sum;
    }
}

