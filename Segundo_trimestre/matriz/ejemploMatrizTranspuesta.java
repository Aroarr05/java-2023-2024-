package matriz;

//Matriz traspuesta

public class ejemploMatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matrizOriginal = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println("Matriz original\n...............");
        for (int filas = 0; filas < matrizOriginal.length; filas++) {
            for (int columnas = 0; columnas < matrizOriginal[filas].length; columnas++) {
                System.out.print(matrizOriginal[filas][columnas] + " ");
            }
            System.out.println();
        }

        int longFilas = matrizOriginal.length;
        int longColumnas = matrizOriginal[longFilas - 1].length;
        int[][] matrizTranspuesta = new int[longColumnas][longFilas];

        for (int filas = 0; filas < matrizOriginal.length; filas++) {
            for (int columnas = 0; columnas < matrizOriginal[filas].length; columnas++) {
                matrizTranspuesta[columnas][filas] = matrizOriginal[filas][columnas];
            }
        }
        System.out.println("\nMatriz transpuesta\n..................");
        for (int filas = 0; filas < matrizTranspuesta.length; filas++) {
            for (int columnas = 0; columnas < matrizTranspuesta[filas].length; columnas++) {
                System.out.print(matrizTranspuesta[filas][columnas] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");

        System.out.println("Matriz simetrica\n..............");

        boolean simetrica = true;
        for (int filas = 0; filas < matrizTranspuesta.length; filas++) {
            for (int columnas = 0; columnas < matrizTranspuesta.length; columnas++) {
                if (matrizOriginal[filas][columnas] != matrizTranspuesta[filas][columnas]) {
                    simetrica = false;
                }
            }
        }
        if (simetrica) {
            System.out.println("Si es.");
        } else {
            System.out.println("No es:");
        }
    }
}
