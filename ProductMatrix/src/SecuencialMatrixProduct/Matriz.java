package SecuencialMatrixProduct;// SOLUCION SECUENCIAL

public class Matriz {
    // Declaro un array como atributo
    private int[][] values;
    //Genero un constructor
    public Matriz(int[][] values) {
        this.values = values;
    }

    // metodo saca la fila
    // tiene la fila que le indica segun en el indice

    public int[] getRow(int rowIndex) {
        if( rowIndex >= 0 && rowIndex < values.length) {
            return values[rowIndex];
        } else {
            throw new IllegalArgumentException("Indice no válido");
        }
    }

    // metodo saca la columna

    public int[] getColumn(int colIndex) {
        int[] output = new int[values.length];
        if( colIndex < values[0].length)  {
            for (var i = 0; i < values.length; i ++) {
                output[i] = values[i][colIndex];
            }
        }
        return output;
    }
    // formatea  la matriz
    public String toString() {
        String output = "";
        for(var fila : values) {
            output += "{";
            for( var value : fila) {
                output += value + "\t";
            }
            output += "}\n";
        }
        return "{\n" + output + "}";
    }

    // metodo multiplicar recibe objeto y devuelve otro objeto

    public Matriz multiply(Matriz mat2){   // (SecuencialMatrixProduct.TaskCalcElement mat2) recibe un objeto de tipo matriz
        // numero de filas de la primera matriz debe ser igual a el numero de columnas de la segunda matriz
        if(values.length == mat2.values[0].length) {
            // output matriz de salida
            int[][] output = new int[values.length][mat2.values[0].length];

            for(var i = 0; i < output.length; i ++) {
                for( var j = 0; j < output[0].length; j ++) {
                    output[i][j] = calcValue(getRow(i), mat2.getColumn(j));
                }
            }
            // Retorna un objeto
            return new Matriz(output);
        } else {
            throw new IllegalArgumentException("No se puede multiplicar");
        }
    }

    //metodo que calcula la multiplicacion de cada fila y columna en su posicion
    private int calcValue (int[] row, int[] col) {
        int element = 0;
        for(var i = 0; i < row.length; i ++ ) {
            element += row[i] * col[i];
        }
        return element;
    }
}
