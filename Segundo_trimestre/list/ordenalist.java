
/*
 * Fusionar listas ordenadas: Toma dos List ordenadas de enteros
 * y fusiona ambas en una nueva lista ordenada, sin utilizar métodos de
 * ordenación, mediante la comparacion de elementos.
 */

package list;

import java.util.*;

public class ordenalist {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        // otra forma de poner la lista de los numeros
        lista1.addAll(List.of(1, 4, 7, 9));
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(5);
        lista2.add(8);
        lista2.add(58);

        ArrayList<Integer> fusion = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) > lista2.get(j)) {
                fusion.add(lista2.get(j));
                j++;

            } else if (lista1.get(i) < lista2.get(j)) {
                fusion.add(lista1.get(i));
                i++;
            }
            while (j < lista2.size()) {
                fusion.add(lista2.get(j));
                j++;
            }
        }
        System.out.println("Lista fusionada: " + fusion);

    }
}
