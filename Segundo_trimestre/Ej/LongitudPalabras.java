package Ej;

//Introduce un texto y cuenata el tamaño de las palabras y agrupalas. 
import java.util.*;

public class LongitudPalabras {
    public static void main(String[] args) {
        System.out.println("Introduce un texto:");
        Scanner entrada = new Scanner(System.in);
        String texto = entrada.nextLine();

        texto = texto.replace(".", "");
        texto = texto.replace(",", "");
        texto = texto.replace(":", "");
        texto = texto.replace(";", "");
        texto = texto.toLowerCase();

        String[] palabras = texto.split(" ");

        TreeMap<Integer, HashSet<String>> mapa = new TreeMap<Integer, HashSet<String>>();
        for (String palabra : palabras) {
            if (mapa.containsKey(palabra.length())) {
                HashSet<String> conjunto = new HashSet<String>();
                conjunto = mapa.get(palabra.length());
                conjunto.add(palabra);
                mapa.put(palabra.length(), conjunto);
            }else{
                HashSet<String> conjunto = new HashSet<String>();
                conjunto.add(palabra);
                mapa.put(palabra.length(), conjunto);
            }
        }
        System.out.println("La/s de longitud minima es /son:"+ mapa.firstEntry());
        System.out.println("La/s de longitud minima es /son:"+ mapa.lastEntry());
    }

}
