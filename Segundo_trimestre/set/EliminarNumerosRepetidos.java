package set;

import java.util.HashSet;

public class EliminarNumerosRepetidos {
    public static void main(String[] args) {
        HashSet<Integer> setNumero = new HashSet<>();

        int [] Numero={1,5,6,7,15,12,7,9,5,10};

        for (int i = 0; i < Numero.length; i++) {
            setNumero.add(Numero[i]);
        }
        System.out.print(setNumero);
    }
}
