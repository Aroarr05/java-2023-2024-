package Ej;

//Añadir al progrma anterior la condición de que la primera letra del nombre debe ser una mayúscula. Es decir, que debe ser un carácter que se encuentre entre `A` Y la `Z`.
//No tendremos es cuenta la `ñ`como letra para simplificar el ejemplo.

import java.util.Scanner;

public class Ejercicio2 {
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
                String palabraAcomparar = palabra. toUpperCase();
                if(palabra.charAt(0)!= palabraAcomparar.charAt(0)){ //(palabra.charAt(0)>'A'|| palabra.charAt(0)>'Z')
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

}
