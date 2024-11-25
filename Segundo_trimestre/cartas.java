import java.util.*;

public class cartas {
  public static void main(String[] args) {
    // Escribimos las distintas barajas con su palo correspondiente

    String[] corazon = { "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK" };
    String[] diamante = { "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK" };
    String[] trebol = { "T1", "2T", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "TJ", "TQ", "TK" };
    String[] pica = { "P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9", "P10", "PJ", "PQ", "PK" };

    // Creo una arryaList para guardar todas las barajas
    ArrayList<String> Cartas = new ArrayList<>();

    // Recorremos todas las barajas
    for (int i = 0; i < corazon.length; i++) {
      Cartas.add(corazon[i]);
      Cartas.add(diamante[i]);
      Cartas.add(trebol[i]);
      Cartas.add(pica[i]);
    }
    // Se desordenan las cartas
    Collections.shuffle(Cartas);

    // Creo dos pilas para separar las cartas
    Stack<String> baraja1 = new Stack<>();
    Stack<String> baraja2 = new Stack<>();

    // Guardo la mitadas de las cartas en la baraja 1
    for (int i = 0; i < Cartas.size() / 2; i++) {
      baraja1.push(Cartas.get(i));
    }
    // Guardoel resto de cartas en la baraja 2
    for (int i = Cartas.size() / 2; i < Cartas.size(); i++) {
      baraja2.push(Cartas.get(i));
    }
    // Pedir a los jugadores que elijan las cartas
    Scanner entrada = new Scanner(System.in);
    System.out.println("JUGADOR.1 elige la baraja: ");
    System.out.println(" - Si eliges 1 es la baraja1 y si eliges 2 es la baraja2: ");
    int player1 = entrada.nextInt();

    System.out.println("JUGADOR.2 elige la baraja: ");
    System.out.println(" - Si eliges 1 es la baraja1 y si eliges 2 es la baraja2: ");
    int player2 = entrada.nextInt();

    String numero1 = "";
    String numero2 = "";

    if (player1 == 1) {
      numero1 = baraja1.peek().substring(1);
      System.out.println(baraja1.peek());
    }
    if (player1 == 2) {
      numero1 = baraja2.peek().substring(1);
      System.out.println(baraja2.peek());
    }

    if (player2 == 1) {
      numero2 = baraja1.peek().substring(1);
      System.out.println(baraja1.peek());
    }
    if (player2 == 2) {
      numero2 = baraja2.peek().substring(1);
      System.out.println(baraja2.peek());
    }

    int valor1 = 0;
    int valor2 = 0;

    switch (numero1) {
      case "1" -> valor1 = 1;
      case "2" -> valor1 = 2;
      case "3" -> valor1 = 3;
      case "4" -> valor1 = 4;
      case "5" -> valor1 = 5;
      case "6" -> valor1 = 6;
      case "7" -> valor1 = 7;
      case "8" -> valor1 = 8;
      case "9" -> valor1 = 9;
      case "10" -> valor1 = 10;
      case "J" -> valor1 = 11;
      case "Q" -> valor1 = 12;
      case "K" -> valor1 = 13;
    }
    switch (numero2) {
      case "1" -> valor2 = 1;
      case "2" -> valor2 = 2;
      case "3" -> valor2 = 3;
      case "4" -> valor2 = 4;
      case "5" -> valor2 = 5;
      case "6" -> valor2 = 6;
      case "7" -> valor2 = 7;
      case "8" -> valor2 = 8;
      case "9" -> valor2 = 9;
      case "10" -> valor2 = 10;
      case "J" -> valor2 = 11;
      case "Q" -> valor2 = 12;
      case "K" -> valor2 = 13;
    }

    if (valor1 == valor2) {
      System.out.println("Empate");
    }
    if (valor1 > valor2) {
      System.out.println("Gana jugador 1");
    }
    if (valor1 < valor2) {
      System.out.println("Gana jugador 2");
    }
  }
}
