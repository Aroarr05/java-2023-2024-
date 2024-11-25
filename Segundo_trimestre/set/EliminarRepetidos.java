package set;

import java.util.LinkedHashSet;

public class EliminarRepetidos {
    public static void main(String[] args) {
        String texto = "Java programming";
        
        LinkedHashSet <Character> resultado = new LinkedHashSet<>();

        for (int i =0; i <texto.length(); i++){
            resultado.add(texto.charAt(i));
        }
       
    System.out.println("La cadena sin caracteres repetidos es:" + resultado);

        for (Character letra :resultado){
            System.out.println(letra);
        }
    }

}
    

