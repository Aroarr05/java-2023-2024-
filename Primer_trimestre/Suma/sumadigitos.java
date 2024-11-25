import java.util.Scanner;

public class sumadigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         System.out.println(" Dame un nº:");
            int num = entrada.nextInt();
            int suma = 0;
         while(num>0){
            int digito = num % 10;
            suma += digito;
            num /=10;
        }
         
         System.out.println(" La suma de los digitos es: " + suma);

         entrada.close();
    }
    
}
