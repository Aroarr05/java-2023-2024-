
/* Ejercicio 1: este código lee las primeras 20 líneas de un archivo de texto largo y 
las escribe en un nuevo archivo de texto corto. Cada vez que se ejecuta, crea un nuevo 
archivo de texto corto con un número de archivo diferente, 
comenzando desde "texto-corto1.txt" y aumentando cada vez que se ejecuta el programa.*/

import java.io.*;

public class TextoDividido {

    public static void main(String[] args) {

        try {
            // Se crea un objeto File para el archivo de texto largo
            File archivo = new File("texto-largo.txt");
            // Se crea un FileReader para leer el archivo
            FileReader lector = new FileReader(archivo);
            // Se envuelve el FileReader en un BufferedReader para leer líneas completas
            BufferedReader lectorConBufferd = new BufferedReader(lector);

            // Contador para el número de archivos cortos creados
            int fileCnt = 1;

            // Nombre del primer archivo corto
            String archivoOut = "texto-corto" + fileCnt + ".txt";
            // Se crea un FileWriter para escribir en el archivo corto
            FileWriter escritor = new FileWriter(archivoOut);
            // Se envuelve el FileWriter en un BufferedWriter para escribir líneas completas
            BufferedWriter escritorConBuffer = new BufferedWriter(escritor);

            // Contador para el número de líneas escritas en el archivo corto actual
            int lineCnt = 0;

            // Bucle que escribe las primeras 20 líneas del archivo largo en el archivo
            // corto
            while (lineCnt < 20) {
                // Se muestra en la consola el número de línea actual
                System.out.println("Linea " + lineCnt + ":");
                // Se escribe la línea actual del archivo largo en el archivo corto
                escritorConBuffer.write(lectorConBufferd.readLine());
                // Se escribe un salto de línea en el archivo corto
                escritorConBuffer.newLine();
                // Se incrementa el contador de líneas escritas
                lineCnt++;
            }
            // Se cierran los lectores y escritores de archivos
            lectorConBufferd.close();
            escritorConBuffer.close();

        } catch (Exception e) {
            // Se manejan las excepciones imprimiendo un mensaje de error
            System.out.println("Error: " + e.getMessage());
        }
    }
}
