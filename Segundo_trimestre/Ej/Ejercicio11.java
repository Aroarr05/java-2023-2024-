package Ej;
//Autor:AROA RIVAS RIOS
/*
 * Formato de nombre: Escribe un programa que tome el nombre completo 
 * de una persona y lo imprima en forma de nombre propio(la primera letra de cada 
 * palabra en mayúscilas.)
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nombreCompleto = "juan carlos pérez";
        String [] palabras= nombreCompleto. split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras){
            resultado.append(Character.toUpperCase(palabra.charAt(0))).append(palabra.substring(1)).append(" ");
        }

        System.out.println("El nombre en formato de nombre propio es: "+ resultado.toString().trim());
    }

    
}
