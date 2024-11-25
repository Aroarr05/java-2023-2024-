package Ej;
//contar palindormo.
public class Ejercicio7 {
    public static void main(String[] args) {
        String texto="anita lava la tina";
        String sinEspacios = texto.replace("","").toLowerCase();
        String reversa ="";
        for(int i = sinEspacios.length()-1;i>=0;i--){
            reversa += sinEspacios.charAt(i);
        }
        if(sinEspacios.equals(reversa)){
            System.out.println("La cadena es un palíndromo");
        }else {
            System.out.println("La cadena no es palíndromo");
        }
    }
}
