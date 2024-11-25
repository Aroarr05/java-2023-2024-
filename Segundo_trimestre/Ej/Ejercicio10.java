package Ej;
//Autor:AROA RIVAS RIOS
/*
*Contar ocurremcia: Escribe un programa que cuente el número de 
*ocurrencias de una subcadena en una cadena de texto.
*Importamos el Scanner
*/
import java.util.Scanner;
//Creamos la clase Ejercicio10

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        //Introducción del texto

        System.out.println("Texto introducido: ");
        String texto = entrada.nextLine();

        System.out.println("Texto: ");
        String subcadena = entrada.nextLine();

        int contador=0;
        texto=texto.toLowerCase();
        subcadena=subcadena.toLowerCase();

        int index = texto.indexOf(subcadena);
        while (index != -1){
            contador++;
            index = texto.indexOf(subcadena,index +1);
        }
        System.out.println("El numero total de las palabras:  ");
        entrada.close();
    }
}
