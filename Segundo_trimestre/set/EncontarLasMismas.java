
package set;
import java.util.*;

//Encontar palabas comunes en dos listas

public class EncontarLasMismas {
    public static void main(String[] args) {
        
    HashSet<String> lista1Set= new HashSet<>();
    HashSet<String> lista2Set= new HashSet<>();

    String[] lista1 = {"hola" ,"mundo"};
    String[] lista2 = {"hola","pc"};

    for (int i = 0; i < lista1.length; i++) {
      lista1Set.add(lista1[i]);
    }

    for (int i =0; i<lista2.length;i++){
        lista2Set.add(lista2[i]);
    }

    /*for(String palabra: lista1Set){
        if(lista2Set.contains(palabra)){
            System.out.println(palabra);
        }
    }*/
    // otra forma
    //lista1Set.retainAll(lista2Set);
    //System.out.println(lista1Set);
    
    // Ahora que salga hola mundo y pc junto sin el otro hola
    lista1Set.addAll(lista2Set);
    System.out.println(lista1Set);
}
}
