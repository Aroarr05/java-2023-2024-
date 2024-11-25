
/* Ejercicio 2: Este código toma un archivo de texto largo y lo divide 
en archivos más cortos, cada uno con el mismo contenido pero con un límite 
de líneas. Cada vez que se ejecuta el programa, crea un nuevo archivo de texto 
corto con un número de archivo diferente, comenzando desde "texto-corto1.txt"
y aumentando cada vez que se ejecuta.*/

import java.io.*;

public class TextoDivididoTo {
    
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
            // Cadena para almacenar la línea actual leída del archivo
            String lineaActual = "";
            // Nombre del archivo de salida donde se escribirán las líneas del archivo largo
            String archivoOut = "texto-corto" + fileCnt + ".txt";
            // Se crea un FileWriter para escribir en el archivo de salida
            FileWriter escritor = new FileWriter(archivoOut);
            // Se envuelve el FileWriter en un BufferedWriter para escribir líneas completas
            BufferedWriter escritorConBuffer = new BufferedWriter(escritor);

            // Contador para el número de líneas escritas en el archivo de salida
            int lineCnt = 0;
            // Se lee la primera línea del archivo largo
            lineaActual = lectorConBufferd.readLine();
            // Bucle que escribe todas las líneas del archivo largo en el archivo de salida
            while (lineaActual != null) {
                // Se muestra en la consola el número de línea actual
                System.out.println("Linea " + lineCnt + ":");
                // Se escribe la línea actual del archivo largo en el archivo de salida
                escritorConBuffer.write(lineaActual);
                // Se escribe un salto de línea en el archivo de salida
                escritorConBuffer.newLine();
                // Se lee la siguiente línea del archivo largo
                lineaActual = lectorConBufferd.readLine();
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
