package Ej;

//Ampliar el progrma anterior para garantizar que el resto de caracteres del nombre introducido son letras minúsculas (caracteres entre 'a'y'z')

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean palabraError = true;

        while (palabraError){
            System.out.print("Introduce un nombre:");
            String palabra = entrada.nextLine();

            if(palabra.length()<1 || palabra.length()>10){
                System.out.println("La palabra no cumple las condiciones");
            }
            else{
                String palabraAcomparar = palabra. toUpperCase();

                if(palabra.charAt(0)!= palabraAcomparar.charAt(0)){ //(palabra.charAt(0)>'A'|| palabra.charAt(0)>'Z')
                    System.out.println("La palabra no cumple las condiciones");
                }
                palabra.substring(1,palabra.length());

                if(palabra.charAt(0)>'a'||palabra.charAt(0)>'z'){
                    System.out.println("El resto de palabras son minusculas");
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
