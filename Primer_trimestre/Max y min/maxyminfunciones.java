import java.util.Scanner;

public class maxyminfunciones {

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Introduzca el número de elementos que va a tener la lista: ");
    int n = entrada.nextInt();
    
//    int lista[];
//    lista = new int[n];
    int lista[] = new int[n];
    
    for(int i=0; i<n; i++) {
      System.out.print("Introduzca el valor del elemento " + (i+1) + ": ");
      lista[i] = entrada.nextInt();
    }
    
    Resultado res = new Resultado();
    res = maxYmin(lista);
    
    System.out.println("El máximo es " + res.max + " y el mínimo es " + res.min);

  }

  static class Resultado {
      int max;
      int min;
  }

  public static Resultado maxYmin(int lista[]) {
    
    int max = lista[0];
    int min = lista[0];
    
    for(int i=0; i < lista.length; i++) {
      if(lista[i] > max) {
        max = lista[i];  
      }
    }
    
    for(int i=0; i < lista.length; i++) {
      if(lista[i] < min) {
        min = lista[i];
      }
    }
    
    Resultado varResultado  = new Resultado();

    varResultado.max = max;
    varResultado.min = min;
    
    return varResultado;
    
  }

}