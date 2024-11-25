package ficheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopiaFicheros {

    public static void copia(String origen, String destino) throws IOException {
        try {
            OutputStream fsalida;
            try ( // Obtener los nombres de los ficheros de origen y destino
                    // y abrir la conexión a los ficheros.
                    InputStream fentrada = new FileInputStream(origen)) {
                fsalida = new FileOutputStream(destino);
                // Crear una variable para leer el flujo de bytes del origen
                byte[] buffer = new byte[256];
                while (true) {
                    // Leer el flujo de bytes
                    int n = fentrada.read(buffer);
                    // Si no queda nada por leer, salir del while
                    if (n < 0) {
                        break;
                    }
                    // Escribir el flujo de bytes leídos al fichero destino
                    fsalida.write(buffer, 0, n);
                }
                // Cerrar los ficheros
            }
            fsalida.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        copia("C:\\Users\\Aroa\\Documents\\Código\\VisualCode\\Java\\Tercer_trimestre\\ficheros\\origen.txt", "C:\\Users\\Aroa\\Documents\\Código\\VisualCode\\Java\\Tercer_trimestre\\ficheros\\destino.txt");
    }

}