package Ej;
//Contar palabras: Escribe un programa que cuente el número de palabras en un cadena de texto

public class Ejercicio8 {
    public static void main(String[] args) {
        
        String texto = "Hola,¿Como estás?";
        int contador =0;

        if(!texto.isEmpty()){
            contador++;
        }
       // for(int i =0)
        int pos= texto.indexOf(" ");
         String nombre = texto.substring(0,pos );
        
        int pos2= texto.indexOf(" ", pos+1);
        String palabra1 = texto.substring(pos+1, pos2);
        String palabra2 = texto.substring(pos2+1, texto.length());
     
        System.out.println("nuemro de palabras:" +nombre+palabra1+palabra2);



    }
    
}
