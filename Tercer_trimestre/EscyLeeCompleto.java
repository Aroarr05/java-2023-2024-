package escylee;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscyLeeCompleto {

    public static void main(String[] args) {
        // Declarar un objeto de tipo archivo
        DataOutputStream archivo = null ;
        DataInputStream fich = null ;
        String nombre = null ;
        int edad = 0 ;
        try {
            // Creando o abriendo para añadir el archivo
            archivo = new DataOutputStream( new FileOutputStream("secuencial.dat",true) );

            // Escribir el nombre y los apellidos
            archivo.writeUTF( "Antonio López Pérez     " );
            archivo.writeInt(33) ;
            archivo.writeUTF( "Pedro Piqueras Peñaranda" );
            archivo.writeInt(45) ;
            archivo.writeUTF( "José Antonio Ruiz Pérez " ) ;
            archivo.writeInt(51) ;
            // Cerrar fichero
            archivo.close();

            // Abrir para leer
            fich = new DataInputStream(new FileInputStream("secuencial.dat"));
            
            // Bucle para leer todo el archivo
            try {
                while (true) { // Se sale del bucle con EOFException
                    nombre = fich.readUTF();
                    System.out.println(nombre);
                    edad = fich.readInt();
                    System.out.println(edad);
                }
            } catch (EOFException eof) {
                // Se alcanzó el final del archivo
                System.out.println("\nEncuentro el fin del archivo.");
            }
            System.out.println("Pero sigo con el programa.");
            fich.close();


      } catch(FileNotFoundException fnfe) { /* Archivo no encontrado */ System.out.println(fnfe.getMessage()); }
        catch (IOException ioe) { /* Error al escribir */ System.out.println(ioe.getMessage());}
        catch (Exception e) { /* Error de otro tipo*/ System.out.println(e.getMessage());}
    }

}
