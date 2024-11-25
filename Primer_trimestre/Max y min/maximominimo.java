import java.util.Scanner;

public class maximominimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       

        System.out.println("Ingrese la cantidad de nº:");
        int cantidadNum = entrada .nextInt();

        System.out.println("Ingrese el nº 1: ");
        int num = entrada.nextInt();

        int max = num;
        int min = num;

        for(int i=2 ; i <= cantidadNum; i++){
            System.out.println(" Ingrese el nº:");
            num = entrada.nextInt();

            if (num>max) {
                max = num;
            }

        
            if (num<min) {
                min = num;
            }
        }
        System.out.println(" El nº max es: " + max); 
        System.out.println(" El nº min es: " + min); 
        entrada.close();
    }

}
