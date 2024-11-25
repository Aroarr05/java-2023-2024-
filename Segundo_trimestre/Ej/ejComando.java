
package Ej;

import java.util.*;

class comando {

    String cmd;
    ArrayList<String> argumento;

    public comando() {
        this.cmd = "";
        this.argumento = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "el comado es " + this.cmd +  " y tiene los argumentos" + this.argumento.toString();
    }
}

public class ejComando {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        Stack<comando> historialAnterior= new Stack<comando
        >();
        Stack<comando> historial = new Stack<comando>();

        boolean bucle = true;

        while (bucle) {
            System.out.println("Introducir comando: ");
            String[] linea = consola.nextLine().split(" ");
            comando comandoNuevo = new comando();
            comandoNuevo.cmd = linea[0];
            for (int i = 1; i < linea.length; i++) {
                comandoNuevo.argumento.add(linea[i]);
            }
            historial.push(comandoNuevo);
            if (linea[0].equals("exist")) {
                bucle = false;
            }if (linea[0].equals("z")) {
                historial.push(historialAnterior.peek());
                historialAnterior.pop();
                System.out.println(historialAnterior.peek());
            }
        }
        while (!historial.isEmpty()) {
            System.out.println(historial.pop());
        }

        

    }
}