import java.util.Scanner;

public class Numeroparesimpare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rangoInicial , rangofinal;

        System.out.print("Ingrese el rango inicial: ");
        rangoInicial = scanner.nextInt();

        System.out.print("Ingrese el rango final: ");
        rangofinal = scanner.nextInt();

        System.out.println("Nº pares en el rango [" + rangoInicial + "-" + rangofinal + " ]:");

        if (rangoInicial % 2 == 0) {
           System.out.print(rangoInicial);
        }
        else{
            System.out.print(rangoInicial + 1 );
        }
        for(int i=rangoInicial + 2 ; i <= rangofinal; i++){
            if(i % 2 == 0){
                System.out.print("-" + i);
            }
        }

        System.out.println(" ");
        System.out.println("Nº impares en el rango [" + rangoInicial + "-" + rangofinal + " ]:");
        if (rangoInicial % 2 != 0) {
           System.out.print(rangoInicial);
        }
        else{
            System.out.print(rangoInicial + 1 );
        }
        for(int i= rangoInicial + 2; i <= rangofinal; i++){
            if(i % 2 != 0){
                System.out.print("-" + i) ;
            }
        }

        scanner.close();

    }
    
}
