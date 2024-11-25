package Ej;
public class Ejercicio4 {

    public static void main(String[] args) {
        String nombreCompleto ="Aroa Riva Rios";
        int pos= nombreCompleto.indexOf(" ");
         String nombre = nombreCompleto.substring(0,pos );
        
        int pos2= nombreCompleto.indexOf(" ", pos+1);
        String apellido = nombreCompleto.substring(pos+1, pos2);
        String apellido2 = nombreCompleto.substring(pos2+1, nombreCompleto.length());

        System.out.println("******************");
         System.out.println("");
        System.out.println("Nombre Completo: "+nombreCompleto);
         System.out.println("");
        System.out.println("******************");
         System.out.println("");
        System.out.println("Nombre: "+nombre);
        System.out.println("Primer apellido: "+apellido);
        System.out.println("Sengundo apellido: "+apellido2);
         System.out.println("");
          System.out.println("******************");
    }
}