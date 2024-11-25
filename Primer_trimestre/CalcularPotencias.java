import java.util.Scanner;

public class CalcularPotencias {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        

        System.out.println("Introduzca un nº como base: ");
        int b = entrada.nextInt();

         System.out.println("Introduzca un nº como exponente: ");
        int e = entrada.nextInt();

        int pot = calcular(b,e);
        System.out.println("El resultado de" + b + "elevado" + e + "es: " + pot);
        entrada.close();
    }
public static int calcular(int b1, int e1){
int resultado;
resultado = 1;
for(int i = 1 ; i <= e1; i ++){
 resultado = (resultado * b1);
}
    return resultado;
}

}
