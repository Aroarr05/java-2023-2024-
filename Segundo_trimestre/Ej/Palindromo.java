package Ej;

import java.util.Scanner;

public class Palindromo {

public static void main(String[]ards) {
    Scanner entrada = new Scanner(System.in);
    String texto = entrada.nextLine();
    String sinEspacios = texto.replace(" ", "").toLowerCase();
    String reversa = "";

    for (int i = sinEspacios.length()-1; i>=0; i--){
        reversa += sinEspacios.charAt(i);
    }
    if (sinEspacios.equals(reversa)){
        System.out.println("La cadena es un palíndromo");
    }else{
        System.out.println("La cadena no es palíndromo");
    }
    
}
}