import java.util.Scanner;

public class maxymin {

  public static void main(String[] args) {
// Llamo al constructor de la clase Scanner para crear una instancia en el objeto entrada
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Introduzca el número de elementos que va a tener la lista: ");
    int n = entrada.nextInt();
    
// Declaro lista como un array de n variables de tipo int
    int lista[] = new int[n];
    
    lista = pedirLista(n);
    
    Resultado res = new Resultado();
    res = maxYmin(lista);
    
    System.out.println("En la lista " + escribirLista(lista) + 
      " el máximo es " + res.max + " y el mínimo es " + res.min);
    entrada.close();
  }

// Declaro la clase Resultado para devolver los 2 valores (max y min) 
  static class Resultado {
      int max;
      int min;
  }
  
// Esta función recibe un array de int y devuelve su máximo y su mínimo 
  public static Resultado maxYmin(int listaDeNumeros[]) {
    int max = listaDeNumeros[0];
    int min = listaDeNumeros[0];
    
    for(int i=0; i < listaDeNumeros.length; i++) {
      if(listaDeNumeros[i] > max) {
        max = listaDeNumeros[i];  
      }
    }
    for(int i=0; i < listaDeNumeros.length; i++) {
      if(listaDeNumeros[i] < min) {
        min = listaDeNumeros[i];
      }
    }
    
    Resultado varResultado  = new Resultado();
    varResultado.max = max;
    varResultado.min = min;
    
    return varResultado;
  }

// Esta función recibe el número de elementos tipo int que tendrá un array,
// pide todos los valores y la devuelve  
  public static int[] pedirLista(int numeroElementos) {
    int listaDeNumeros[] = new int[numeroElementos];

    Scanner entradaDfuncion = new Scanner(System.in);

    for(int i = 0; i < numeroElementos; i++) {
      System.out.print("Introduzca el valor del elemento " + (i+1) + ": ");
      listaDeNumeros[i] = entradaDfuncion.nextInt();
    }    

    entradaDfuncion.close();
    return listaDeNumeros;
  }

// Esta función recibe un array de int y la devuelve en un String con formato
  public static String escribirLista(int listaDeNumeros[]) {
    String resultado = "[ ";
    for(int i = 0; i < listaDeNumeros.length; i++) {
      resultado += listaDeNumeros[i];
      if (i < listaDeNumeros.length - 1) { resultado += " - ";}
    }     

    return resultado + " ]";
  }
}
