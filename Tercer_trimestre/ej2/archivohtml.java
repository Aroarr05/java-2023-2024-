/* Ejercicio 2: Este código toma un archivo de texto corto y genera un archivo HTML 
donde cada palabra del archivo original es envuelta en una etiqueta <p>. Si una palabra 
comienza con la letra 's' o 'S', se escribe en negrita utilizando la etiqueta <b>. El archivo
 HTML resultante tiene la estructura básica de un documento HTML, 
con cada línea del archivo original convertida en un párrafo dentro del cuerpo del documento.*/

import java.io.*;

public class archivohtml {
    public static void main(String[] args) {
        try {
            // Leer archivo de texto corto
            File archivoIn = new File("txto-corto1.txt");
            FileReader lector = new FileReader(archivoIn);
            BufferedReader lecBuffered = new BufferedReader(lector);

            // Crear archivo HTML de salida
            String archivoOut = "archivo1.html";
            FileWriter escritor = new FileWriter(archivoOut);
            BufferedWriter escBuffered = new BufferedWriter(escritor);

            // Leer la primera línea del archivo de texto corto
            String lineaActual = lecBuffered.readLine();

            // Escribir la estructura inicial del archivo HTML
            escBuffered.write("<!DOCTYPE html><html><head><title>Conversor de texto a Html</title></head><body>");

            // Bucle para procesar cada línea del archivo de texto corto
            while (lineaActual != null) {
                // Dividir la línea en palabras
                String[] palabras = lineaActual.split(" ");
                // Escribir una etiqueta de párrafo para cada línea
                escBuffered.write("<p>");
                // Procesar cada palabra de la línea
                for (int i = 0; i < palabras.length; i++) {
                    // Verificar si la palabra comienza con 's' o 'S'
                    if (!palabras[i].isEmpty() && (palabras[i].charAt(0) == 's' || palabras[i].charAt(0) == 'S')) {
                        // Si la palabra comienza con 's' o 'S', se escribe en negrita
                        escBuffered.write("<b>" + palabras[i] + "</b>" + " ");
                    } else {
                        // Si no, se escribe normalmente
                        escBuffered.write(palabras[i] + " ");
                    }
                    // Limpiar el buffer
                    escBuffered.flush();
                }
                // Cerrar la etiqueta de párrafo
                escBuffered.write("</p>");
                // Nueva línea para el siguiente párrafo
                escBuffered.newLine();
                // Leer la siguiente línea del archivo de texto corto
                lineaActual = lecBuffered.readLine();
            }
            // Escribir la estructura final del archivo HTML
            escBuffered.write("</body></html>");
            // Cerrar el BufferedWriter
            escBuffered.close();
        } catch (Exception e) {
            // Manejar las excepciones imprimiendo un mensaje de error
            System.out.println("Error: " + e.getMessage());
        }
    }
}
