/* Ejercicio 3: Este código toma un archivo de texto largo y lo divide en archivos 
más cortos, cada uno con un máximo de 20 líneas. Cada vez que se alcanza este límite, 
se cierra el archivo actual y se crea un nuevo archivo de salida con un número de archivo incrementado.*/

import java.io.*;

public class textoTodo {

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
                System.out.println("Linea " + lineCnt + ":");
                // Se escribe la línea actual del archivo largo en el archivo de salida
                escritorConBuffer.write(lineaActual);
                // Se escribe un salto de línea en el archivo de salida
                escritorConBuffer.newLine();
                // Se lee la siguiente línea del archivo largo
                lineaActual = lectorConBufferd.readLine();
                // Se incrementa el contador de líneas escritas
                lineCnt++;

                // Si se ha alcanzado el límite de 20 líneas por archivo
                if (lineCnt % 20 == 0) {
                    // Se cierra el escritor actual
                    escritorConBuffer.close();
                    // Se incrementa el contador de archivos
                    fileCnt++;
                    // Se crea un nuevo nombre para el archivo de salida
                    archivoOut = "texto-corto" + fileCnt + ".txt";
                    // Se crea un nuevo FileWriter para el nuevo archivo de salida
                    escritor = new FileWriter(archivoOut);
                    // Se envuelve el nuevo FileWriter en un BufferedWriter
                    escritorConBuffer = new BufferedWriter(escritor);
                }
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
