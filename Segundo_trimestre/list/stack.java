package list;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriebe un palindromo: ");
        String texto = entrada.nextLine();

        Stack<Character> apilar = new Stack<>();
        int mitad = texto.length() / 2;

        for (int i = 0; i < texto.length(); i++) {
            if (i < mitad) {
                apilar.push(texto.charAt(i));
            } else {
                if (texto.charAt(i) == apilar.peek()) {
                    apilar.pop();
                }
            }
        }
        if(apilar.empty()){
            System.out.println("Palindromo. ");
        } else{
            System.out.println("No lo es. ");
        }
    }
}
