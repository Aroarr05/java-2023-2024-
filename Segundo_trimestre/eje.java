
/* 
 * 
CREA UN PROGRMA PARA JUGAR A LAS CARTAS MAS ALTAS: 
-deberemos crear una estructura donde tener la baraja completa(de 1 a 10 y j,q,k por cada palo(corazones,picas,dimantes y treboles))
-habra que barajar (metodo shuffle).
-habra que crear dos montones (pilas) dividiendo la baraja.
-se pedira por consola al jugado 1 que pida un monton y se sacra la carta de arriba.
-se pedira lo mismo al jugador 2.
-habra que comparar las cartas para saber el ganador.
 *
 */

import java.util.*;

public class eje {
    public static void main(String[] args) {
        
        //Escribimos las distintas barajas con su palo correspondiente

        String[] corazon={"C1","C2","C3","C4","C5","C6","C7","C8","C9","C10","CJ","CQ","CK"} ;
        String[] diamante={"D1","D2","D3","D4","D5","D6","D7","D8","D9","D10","DJ","DQ","DK"} ;
        String[] trebol={"T1","2T","T3","T4","T5","T6","T7","T8","T9","T10","TJ","TQ","TK"} ;
        String[] pica={"P1","P2","P3","P4","P5","P6","P7","P8","P9","P10","PJ","PQ","PK"} ;

        //Creo una arryaList para guardar todas las barajas 
        ArrayList<String> Cartas = new ArrayList<>();

        //Recorremos todas las barajas 
        for (int i = 0; i < corazon.length; i++) {
            Cartas.add(corazon[i]);
            Cartas.add(diamante[i]);
            Cartas.add(trebol[i]);
            Cartas.add(pica[i]);
        }
        //Se desordenan las cartas 
        Collections.shuffle(Cartas);

        //Creo dos pilas para separar las cartas 
        Stack<String> baraja1 = new Stack<>();
        Stack<String> baraja2 = new Stack<>();

        //Guardo la mitadas de las cartas en la baraja 1
        for (int i = 0; i < Cartas.size()/2; i++) {
            baraja1.push(Cartas.get(i));
        }
        //Guardoel resto de cartas en la baraja 2
        for (int i = Cartas.size()/2; i < Cartas.size(); i++) {
            baraja2.push(Cartas.get(i));
        }
        //Pedir a los jugadores que elijan las cartas 
        Scanner entrada= new Scanner(System.in);
        System.out.println("JUGADOR.1 elige la baraja: ");
        System.out.println(" - Si eliges 1 es la baraja1 y si eliges 2 es la baraja2: ");
        int player1= entrada.nextInt();
        System.out.println("JUGADOR.2 elige la baraja: ");
        System.out.println(" - Si eliges 1 es la baraja1 y si eliges 2 es la baraja2: ");
        int player2 = entrada.nextInt();

        if(player1 == 1){
            baraja1.peek();
        }if(player1 ==2){
            baraja2.peek();
        }

        if(player2 == 1){
            baraja1.peek();
        }if(player2 == 2){
            baraja2.peek();
        }



    }
}
