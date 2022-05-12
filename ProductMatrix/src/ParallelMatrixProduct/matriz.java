package ParallelMatrixProduct;
import ParallelMatrixProduct.TaskCalcElement;
import java.util.ArrayList;
import java.util.List;
public class matriz {
    private int[][] values;
    public matriz(int[][] values) {
        this.values = values;
    }
    public matriz multiplyWithThreads(matriz mat2) throws InterruptedException {
        List<TaskCalcElement> threads;
        if (values.length == mat2.values[0].length) {
            // output matriz de salida
            int[][] output = new int[values.length][mat2.values[0].length];
            threads = new ArrayList<>();
            for (var i = 0; i < output.length; i++) {
                for (var j = 0; j < output[0].length; j++) {
                    TaskCalcElement thread = new TaskCalcElement(this, mat2, i, j);
                    thread.start();
                    threads.add(thread);
                }
            }
            setWaitThreads(threads);
            for (var t : threads) {
                output[t.getRowIndex()][t.getColIndex()] = t.getElement();
            }
            // Retorna un objeto
            return new matriz(output);
        } else {
            throw new IllegalArgumentException("No se puede multiplicar");
        }
    }
    private void setWaitThreads(List<TaskCalcElement> threads) throws InterruptedException {
        for (var t : threads) {
            t.join();
        }
    }

    public int[] getRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < values.length) {
            return values[rowIndex];
        } else {
            throw new IllegalArgumentException("Indice no válido");
        }
    }

    // metodo saca la columna

    public int[] getColumn(int colIndex) {
        int[] output = new int[values.length];
        if (colIndex < values[0].length) {
            for (var i = 0; i < values.length; i++) {
                output[i] = values[i][colIndex];
            }
        }
        return output;
    }

    // formatea  la matriz
    public String toString() {
        String output = "";
        for (var fila : values) {
            output += "{";
            for (var value : fila) {
                output += value + "\t";
            }
            output += "}\n";
        }
        return "{\n" + output + "}";
    }

}
