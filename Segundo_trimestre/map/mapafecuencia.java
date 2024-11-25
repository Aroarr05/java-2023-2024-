
/*
* Mapa de frecuencias: Crea un Map para calcular
* la frecuencia de aparición de palabra en un texto
*/

package map;
import java.util.*;;

public class mapafecuencia {
    public static void main(String[] args) {
        String texto= "Hola Ana y Hola Carmen";
        
        texto=texto.toLowerCase();

        String[] palabras = texto.split(" ");

        HashMap<String,Integer> frecuenciaPalabras = new HashMap<>();

        //for (String palabra : palabras) {
        for (int i = 0; i < palabras.length; i++) { 
           
            if (frecuenciaPalabras.containsKey(palabras[i])) {
                int plab = frecuenciaPalabras.get(palabras[i]);
                frecuenciaPalabras.replace(palabras[i],plab + 1);
            } else {
               frecuenciaPalabras.put(palabras[i], 1);
            }
        }
        System.out.println(frecuenciaPalabras);
    }
}
