package Ej;

//Escribe un programa que solicite por teclado un nombre cuya logitud debe ser como mínimo de la letra y
//como máximo de diez.Si el nombre introducido no cumple esos criterios, debe mostrar un mensaje de error y 
//volver a solicitarse hasta que en efecto se cumpla esa regla.
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean palabraError = true;

        while (palabraError){
            System.out.print("Introduce un nombre:");
            String palabra = scanner.nextLine();
            if(palabra.length()<1 || palabra.length()>10){
                System.out.println("La palabra no cumple las condiciones");
            }
            else{
                System.out.println("La palabra "+ palabra + "es correcta");
                palabraError = false;
            }
        }
    }
    //entrada.close();
}
