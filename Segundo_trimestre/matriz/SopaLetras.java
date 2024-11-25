package matriz;

import java.util.Arrays;


public class SopaLetras {
 public static void main(String[] args) {
    /*
    *Declarar un array unidimensional de String que represente la lista de palabras 
    *que se desean buscar en la sopa.
    *Contendrá la lista de palabras que se nos ha indicado.
    */
    String[] palabras ={"Hola","sol","AMOR","ARA","Casa", "dos"};
    //Declarar un array bidimensional de caracteres (tipo char) para representar la sopa de letras.
    char[][] letras={
        {'H','J','S','O','L'},
        {'O','E','C','A','U'},
        {'L','Y','K','D','A'},
        {'A','A','M','O','R'},
        {'V','C','A','S','A'}
    };
    
System.out.println("BUSCADOR DE PALABRAS EN HORIZONTAL");
System.out.println("----------------------------------");
System.out.println("Sopa de letras: ");
/* 
Mostrar por pantalla el contenido de la sopa de letras en forma de tabla. La forma más sencilla es mediante un
 doble bucle que recorra filas y columnas.
 */
for (int fila = 0; fila < letras.length; fila++) {
    for (int columna = 0; columna < letras[fila].length; columna++) {
    System.out.print(letras[fila][columna]+" ");
}
System.out.println(" ");
}

//Declarar un array unidimensional de String para almacenar los resultados.
String[] resultados = new String[palabras.length];

/*Mostrar por pantalla la lista de palabras que van a ser buscadas en la sopa. La forma más sencilla es mediante
 la herramienta Arrays.ToString.*/
System.out.println("Lista de palabras de prueba: " + Arrays.toString(palabras));

// Reservar espacio para el array de resultados.
// No se usa un literal para asegurar que el tamaño es el mismo que la cantidad de palabras.
// Se inicializa con "no" para el caso en que la palabra no sea encontrada.
for (int i = 0; i < resultados.length; i++) {
    resultados[i] = "no";
}

// Explorar la sopa de letras para buscar cada palabra horizontalmente.
for (int i = 0; i < palabras.length; i++) {
    for (int fila = 0; fila < letras.length; fila++) {
        for (int columna = 0; columna <= letras[fila].length - palabras[i].length(); columna++) {
            // Extraer la subcadena de la sopa de letras para comparar con la palabra
            String subcadena = new String(letras[fila], columna, palabras[i].length());
            // Comparar la subcadena con la palabra, ignorando mayúsculas y minúsculas
            if (subcadena.equalsIgnoreCase(palabras[i])) {
                resultados[i] = "fila " + fila + " columna " + columna;
            }
        }
    }
}
// Mostrar por pantalla el array de resultados.
System.out.println("\nResultados:\n----------");
System.out.print("[");
for (int i = 0; i < resultados.length; i++) {
    System.out.print(resultados[i] + ",");
}
System.out.print("]");
System.out.println(" ");

}

}

 
 





