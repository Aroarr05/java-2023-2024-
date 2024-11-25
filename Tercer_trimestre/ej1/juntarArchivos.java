/* Ejercicio 4: Tenemos que juntar los 5 archivos creados anteriormente*/

import java.io.*;

public class juntarArchivos {
    
    public static void main(String[] args) {
        try {
            // Se crea un objeto File para el primer archivo de texto corto
            File archivoIn = new File("texto-corto1.txt");
            // Se crea un FileReader para leer el archivo
            FileReader lector = new FileReader(archivoIn);
            // Se envuelve el FileReader en un BufferedReader para leer líneas completas
            BufferedReader lectorConBufferd = new BufferedReader(lector);

            // Nombre del archivo de salida donde se unirán todos los archivos
            String archivoOut = "texto-unido.txt";
            // Se crea un FileWriter para escribir en el archivo de salida
            FileWriter escritor = new FileWriter(archivoOut);
            // Se envuelve el FileWriter en un BufferedWriter para escribir líneas completas
            BufferedWriter escritorConBuffer = new BufferedWriter(escritor);

            // Se lee la primera línea del primer archivo de texto corto
            String lineaActual = lectorConBufferd.readLine();

            // Bucle que itera sobre los cinco archivos de texto corto
            for (int i = 0; i < 5; i++) {
                // Bucle que lee todas las líneas del archivo actual hasta llegar al final
                while (lineaActual != null) {
                    // Se escribe la línea actual en el archivo de salida
                    escritorConBuffer.write(lineaActual);
                    // Se escribe un salto de línea en el archivo de salida
                    escritorConBuffer.newLine();
                    // Se lee la siguiente línea del archivo actual
                    lineaActual = lectorConBufferd.readLine();
                }
                // Se cierra el lector del archivo actual
                lectorConBufferd.close();
                // Se cambia el nombre del archivo a leer al siguiente en la secuencia
                archivoIn = new File("texto-corto" + (i+1) + ".txt");
                // Se crea un nuevo lector para el nuevo archivo
                lector = new FileReader(archivoIn);
                // Se envuelve el nuevo lector en un BufferedReader
                lectorConBufferd = new BufferedReader(lector);
                // Se lee la primera línea del nuevo archivo
                lineaActual = lectorConBufferd.readLine();
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
