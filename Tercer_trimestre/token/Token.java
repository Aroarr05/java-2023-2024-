package token;

/*Este programa básicamente cuenta la cantidad de palabras y números en un archivo de texto dado.
 Utiliza un StreamTokenizer para leer el archivo, identificar palabras y números, y luego cuenta 
 cuántos de cada tipo encuentra. Luego imprime estos conteos en la consola. Además, maneja las 
 posibles excepciones que puedan surgir durante el proceso de lectura del archivo, como 
 FileNotFoundException e IOException, y muestra un mensaje apropiado en caso de que ocurran. */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class Token {
    // Método para contar palabras y números en un archivo
    public static void contarPalabrasyNumeros(String nombre_fichero) {  
        StreamTokenizer sTokenizer = null;   // Inicializa el tokenizador de flujo
        int contapal = 0, numNumeros = 0;   // Variables para contar palabras y números
        try {   
            // Crea un objeto StreamTokenizer para leer desde un archivo
            sTokenizer = new StreamTokenizer(new FileReader(nombre_fichero));   
            // Lee el archivo hasta el final
            while (sTokenizer.nextToken() != StreamTokenizer.TT_EOF) {   
                // Si el token es una palabra, incrementa el contador de palabras
                if (sTokenizer.ttype == StreamTokenizer.TT_WORD)   
                    contapal++;   
                // Si el token es un número, incrementa el contador de números
                else if (sTokenizer.ttype == StreamTokenizer.TT_NUMBER)   
                    numNumeros++;   
            }   
            // Imprime el número de palabras en el archivo
            System.out.println("Número de palabras en el fichero: " + contapal);   
            // Imprime el número de números en el archivo
            System.out.println("Número de números en el fichero: " + numNumeros);   
        } catch (FileNotFoundException ex) {   
           // Captura la excepción si el archivo no se encuentra
           System.out.println(ex.getMessage());   
        } catch (IOException ex) {   
           // Captura la excepción si hay un error de lectura en el archivo
           System.out.println(ex.getMessage());   
        }   
    }
    
    // Método principal donde comienza la ejecución del programa
    public static void main(String[] args) {   
        // Llama al método para contar palabras y números, pasando el nombre del archivo como argumento
        contarPalabrasyNumeros("C:\\Users\\Aroa\\Documents\\Código\\VisualCode\\Java\\Tercer_trimestre\\token\\datos.txt");   
    }   
}
