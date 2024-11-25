package Ej;
//  Autor:AROA RIVAS RIOS
/*
 * Reemplazar palabras: Escribe un programa que reemplace
 * todas las ocurrencias de una palabra en una cadena de texto por 
 * otra palabra dada.
 */

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Texto introducido: ");
        String texto = entrada.nextLine();

        System.out.println("Introduzca la palabra sustituir");
        String palabraAnt = entrada.nextLine();

        System.out.println("Introduzca la palabra con la que sustituir: ");
        String palabraNew = entrada.nextLine();

       System.out.println(texto.replace(palabraAnt.toLowerCase(), palabraNew.toLowerCase()));

    }
}
