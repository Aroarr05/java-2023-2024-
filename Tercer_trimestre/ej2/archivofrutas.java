
/*Este código lee un archivo de texto llamado "frutas.txt" que contiene una lista de frutas, 
una por línea. Luego, almacena estas frutas en un ArrayList y las ordena en orden alfabético 
utilizando el método Collections.sort(). Finalmente, imprime las frutas ordenadas en la consola. 
Si ocurre algún error durante el proceso de lectura o ordenación, se captura y se imprime un mensaje de error. */

import java.io.*;
import java.util.*;

public class archivofrutas {
    public static void main(String[] args) {
        try {
            // Se abre el archivo de texto para lectura
            File archivoIn = new File("frutas.txt");
            FileReader lector = new FileReader(archivoIn);
            BufferedReader lecBuffered = new BufferedReader(lector);

            // Se crea un ArrayList para almacenar las frutas del archivo
            ArrayList<String> frutas = new ArrayList<String>();

            // Se lee la primera línea del archivo
            String lineaActual = lecBuffered.readLine();

            // Bucle para leer todas las líneas del archivo
            while (lineaActual != null) {
                // Se añade cada línea al ArrayList de frutas
                frutas.add(lineaActual);
                // Se lee la siguiente línea del archivo
                lineaActual = lecBuffered.readLine();
            }

            // Se ordenan las frutas en orden alfabético
            Collections.sort(frutas);

            // Se imprime cada fruta ordenada
            for (int i = 0; i < frutas.size(); i++) {
                System.out.println(frutas.get(i));
            }
        } catch (Exception e) {
            // Si ocurre una excepción, se maneja aquí
            System.out.println("Error: " + e.getMessage());
        }
    }
}
