package matriz;




import java.util.*;

public class claseMatriz {
    static class cMatriz implements Comparable<cMatriz> {
        private String nombre;
        private int filas;
        private int columnas;
        private int[][] matriz;

        public cMatriz(String nombre, int[][] matriz) {
            this.nombre = nombre;
            this.filas = matriz.length;
            this.columnas = matriz[matriz.length - 1].length;
            this.matriz = new int[this.filas][this.columnas];
            this.matriz = matriz;
        }

        public int sumMatriz() {
            int solucion = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    solucion = solucion + matriz[i][j];
                }
            }
            return solucion;
        }

        @Override
        public int compareTo(cMatriz otrasMatriz) {
            // return this.nombre.compareTo(otrasMatriz.nombre);
            int a = this.sumMatriz();
            int b = otrasMatriz.sumMatriz();

            if (a < b) {
                return -1;
            }
            if (a > b) {
                return 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Hola, la matriz " + Arrays.deepToString(matriz) + nombre;
        }
    }

    public static void main(String[] args) {

        int[][] matriz = { { 9, 3, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int[][] matriz1 = { { 1, 2, 3 },
                { 4, 8, 2 },
                { 7, 8, 9 } };

        int[][] matriz2 = { { 9, 2, 3 },
                { 4, 45, 6 },
                { 7, 8, 9 } };

        TreeSet<cMatriz> matriZPersonas = new TreeSet<>();

        matriZPersonas.add(new cMatriz("ana", matriz));
        matriZPersonas.add(new cMatriz("zarmen", matriz1));
        matriZPersonas.add(new cMatriz("xx", matriz2));

        for (cMatriz n : matriZPersonas) {
            // System.out.println(persona.getNombre() + " - " + persona.getEdad());
            System.out.println(n.toString());
        }

    }

}
