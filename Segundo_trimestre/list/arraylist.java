
/*Eliminar elementos mayores a un valor: Escribe un programaque 
 * elimine de una list de enteros
 * todos los elementos que son mayores a un valor especifico.
 */

package list;

import java.util.*;

public class arraylist {

    public static void main(String[] args) {
        List<Integer> arrayEnteros = new ArrayList<>();
        arrayEnteros.add(12);
        arrayEnteros.add(5);
        arrayEnteros.add(8);
        arrayEnteros.add(10);
        // para que se vean los numeros
        System.out.println("");
        System.out.println("Los numeros entereos de la array: ");
        System.out.println(arrayEnteros);
        // Recorre toda la arrayEnteros con size
        for (int i = 0; i < arrayEnteros.size(); i++) {
            // se dice que numero quieres eliminar
            if (arrayEnteros.get(i) > 10) {
                // se elimina el numero
                arrayEnteros.remove(i);
            }
        }
        // se vuelve a escribir el numero sin el eliminado.
        System.out.println(arrayEnteros);
    }
}
