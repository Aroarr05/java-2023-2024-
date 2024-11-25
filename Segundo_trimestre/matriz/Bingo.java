package matriz;

//Autor: AROA RIVAS RIOS

import java.util.Arrays;

public class Bingo {
    public static void main(String[] args) {
        // Declarar un array de números que han salido.
        int[] bolasSalidas = {1, 2, 5, 10, 11, 12, 14, 15, 22, 55, 56, 57, 59, 60, 61, 66, 78, 89, 90};

        // Declarar un array para representar el cartón.
        int[][] carton = {
            {1, 2, 5, 9},
            {11, 15},
            {22, 29},
            {34},
            {47, 49},
            {55, 59, 60},
            {61},
            {71, 75},
            {88, 90} 
        };
        // Declarar un array de String para almacenar los resultados.
        String[] resultados = new String[9];

        // Mostrar por pantalla el cartón.
        System.out.println("\nBUSCADOR DE LÍNEA EN UN CARTÓN DE BINGO:\n........................................");
        System.out.print("Cartón: [");
        // i=filas y j=columnas
        for (int i = 0; i < carton.length; i++) {
            System.out.print("[");
            //Mostrar los números de cada fila del cartón
            for (int j = 0; j < carton[i].length; j++) {
                if (j < carton[i].length - 1) {
                    System.out.print(carton[i][j] + ",");
                } else {
                    System.out.print(carton[i][j]);
                }
            }
            //Mostrar las comas y corchetes que delimitan las filas
             if (i < carton.length - 1) {
            System.out.print("],");
            } else {
            System.out.print("]");
            }
        }
        
        // Mostrar por pantalla los números que han salido.
        System.out.println(" ");
        System.out.print("Números que ya han salido: ");
        System.out.println(Arrays.toString(bolasSalidas));
       
        /*
         * Se realiza la búsqueda de líneas en el cartón. se recorren las filas
         * y para cada número en una fila, se compara con los números que han salido.
         * Si todos los números de una fila han salido, se marca como "linea" en el 
         * array resulatdo y se incrementa el contador contLinea.
        */
        int contLinea =0;
        int contNumero ;
        for (int i = 0; i < carton.length; i++) {
            contNumero= carton[i].length;
            for (int j = 0; j< carton[i].length; j++) {
                for (int k = 0; k < bolasSalidas.length; k++) {
                    if (carton[i][j] == bolasSalidas[k]) {
                        contNumero--;
                    } 
                }
                if (contNumero == 0) {
                    resultados[i]="linea";
                    contLinea++;
                }
                else{
                    resultados[i] = "no";
                }        
            }
        }
        // Mostrar por pantalla el resultados.
        System.out.println(" ");
        System.out.println("\nResultados:\n...........");
        System.out.println("Resultado de la búsqueda de líneas en el cartón de bingo:");
        System.out.print("[ ");
        //Se muestra el resultdo de la búsqueda de líneas en el cartón,mostrando si hay "linea" o "no" en cada fila.
        for (int i = 0; i < resultados.length; i++) {
            if (i == resultados.length - 1) {
                System.out.println(resultados[i]+" ]");
            }else{
                System.out.print(resultados[i]+" - ");
            }
        }
        // Moatrar en pantalla los Números de líneas obtenidos.
        System.out.println(" ");
        System.out.println("Números de líneas obtenidas: " + contLinea);
        System.out.println(" ");
    }
}