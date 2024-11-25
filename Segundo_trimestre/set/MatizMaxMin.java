package set;
import java.util.TreeSet;

public class MatizMaxMin {

    public static void main(String[] args) {
        int[][]matriz={
            {1,2,3},
            {2,5,6},
            {3,6,9}
        };
        TreeSet <Integer> resultados= new TreeSet<>();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultados.add(matriz[i][j]);
            }
        }

        System.out.println(resultados.first());
        System.out.println(resultados.last());

    }
    
}