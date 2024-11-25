package Ej;
//2.Reversa de una cadena: Escribe un programa que invierta una cadena de texto

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Texto introducido: ");
        String texto = entrada.nextLine();
        String textoInv ="";

        for(int i = texto.length()-1;i >=0;i--){
            textoInv=textoInv+ texto.charAt(i);
        }
        System.out.println("la palabra invertida es: "+textoInv);
        entrada.close();
    }


    
}
