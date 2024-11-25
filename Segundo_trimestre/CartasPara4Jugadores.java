import java.util.*;

public class CartasPara4Jugadores {
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

        // Creo dos pilas para separar las cartas
        Stack<String> baraja = new Stack<>();
        String num1 = "";
        String num2 = "";
        String num3 = "";
        String num4 = "";
        for (int i = 0; i < 4; i++) {

            // Se desordenan las cartas
            Collections.shuffle(Cartas);
            for (int j = 0; j < Cartas.size(); j++) {
                baraja.push(Cartas.get(j));

                int corte = (int) (Math.random() * Cartas.size());

                if (j == corte) {
                    System.out.println("El jugador " + (i+1) + " ,su carta es:");

                    if (i == 0) {
                        num1 = baraja.pop();
                        System.out.println(num1);
                    }
                    if (i == 1) {
                        num2 = baraja.pop();
                        System.out.println(num2);
                    }
                    if (i == 2) {
                        num3 = baraja.pop();
                        System.out.println(num3);
                    }
                    if (i == 3) {
                        num4 = baraja.pop();
                        System.out.println(num4);
                    }
                }
            }
        }
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int valor4 = 0;

        switch (num1) {
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
        switch (num2) {
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
        switch (num3) {
            case "1" -> valor3 = 1;
            case "2" -> valor3 = 2;
            case "3" -> valor3 = 3;
            case "4" -> valor3 = 4;
            case "5" -> valor3 = 5;
            case "6" -> valor3 = 6;
            case "7" -> valor3 = 7;
            case "8" -> valor3 = 8;
            case "9" -> valor3 = 9;
            case "10" -> valor3 = 10;
            case "J" -> valor3 = 11;
            case "Q" -> valor3 = 12;
            case "K" -> valor3 = 13;
        }
        switch (num4) {
            case "1" -> valor4 = 1;
            case "2" -> valor4 = 2;
            case "3" -> valor4 = 3;
            case "4" -> valor4 = 4;
            case "5" -> valor4 = 5;
            case "6" -> valor4 = 6;
            case "7" -> valor4 = 7;
            case "8" -> valor4 = 8;
            case "9" -> valor4 = 9;
            case "10" -> valor4 = 10;
            case "J" -> valor4 = 11;
            case "Q" -> valor4 = 12;
            case "K" -> valor4 = 13;
        }

        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
            System.out.println("Gana jugador 1");
        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
            System.out.println("Gana jugador 2");
        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
            System.out.println("Gana jugador 3");
        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
            System.out.println("Gana jugador 4");
        } else {
            System.out.println("Empate");
        }
    }
}
