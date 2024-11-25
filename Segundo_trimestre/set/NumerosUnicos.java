package set;
import java.util.HashSet;


public class NumerosUnicos {
    public static void main(String[] args) {

        int[] lista = {1,2,3,3,4,5,8,8};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < lista.length; i++) {
            if(!set1.add(lista[i])){
                set2.add(lista[i]);
            }
        }
        
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        set1.removeAll(set2);
        System.out.println("Hay "+ set1.size() + " elementos únicos.");
        System.out.println("Los elementos unicos: " + set1);

    }
}
