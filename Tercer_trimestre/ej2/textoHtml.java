
/* Ejercicio 1: Este código toma un archivo de texto y lo convierte en un documento HTML. 
Cada línea del archivo de texto se envuelve dentro de una etiqueta de párrafo <p> en el 
documento HTML resultante. El documento HTML generado contiene la estructura básica de un documento HTML, 
con la etiqueta de apertura <!DOCTYPE html>, las etiquetas <html>, <head> y <body>, y la etiqueta de cierre </html>.*/

import java.io.*;

public class textoHtml {
    public static void main(String[] args) {
        try {
            // Se abre el archivo de texto de entrada para lectura
            File archivoIn = new File("texto.txt");
            FileReader lector = new FileReader(archivoIn);
            BufferedReader lectorConBufferd = new BufferedReader(lector);

            // Se define el nombre del archivo HTML de salida
            String archivoOut = "texto.html";
            // Se crea un FileWriter para escribir en el archivo HTML
            FileWriter escritor = new FileWriter(archivoOut);
            // Se envuelve el FileWriter en un BufferedWriter para escribir líneas completas
            BufferedWriter escritorConBuffer = new BufferedWriter(escritor);

            // Se escribe la estructura inicial del documento HTML
            escritorConBuffer.write(" <!DOCTYPE html><html><head><title> Convertidor de Texto a HTML </title></head><body>");

            // Se lee la primera línea del archivo de texto de entrada
            String contenido = lectorConBufferd.readLine();
            // Bucle para escribir cada línea del archivo de texto como un párrafo en el archivo HTML
            while (contenido != null) {
                // Se escribe la línea dentro de una etiqueta de párrafo
                escritorConBuffer.write("<p>" + contenido + "</p>");
                // Se escribe un salto de línea en el archivo HTML
                escritorConBuffer.newLine();
                // Se lee la siguiente línea del archivo de texto
                contenido = lectorConBufferd.readLine();
            }
            // Se escribe la estructura final del documento HTML
            escritorConBuffer.write("</body></html>");
            // Se cierra el BufferedWriter
            escritorConBuffer.close();
        } catch (Exception e) {
            // Se manejan las excepciones imprimiendo un mensaje de error
            System.out.println("Error: " + e.getMessage());
        }
    }
}
