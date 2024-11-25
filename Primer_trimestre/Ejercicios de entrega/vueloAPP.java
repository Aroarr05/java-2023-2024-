
//Autor: Aroa Rivas Rios 

import java.util.Scanner;

public class vueloAPP {

    
    static class Vuelo{
        //Declaración de los atributos de la clases.
        String numeroVuelo;
        String origen;
        String destino;
        int asientosDisp;
        //Declaración del constructor de la clase.
        public  Vuelo(String numeroVuelo, String origen, String destino, int asientosDisp) {
            this.numeroVuelo = numeroVuelo;
            this.origen = origen;
            this.destino = destino;
            this.asientosDisp = asientosDisp;
            //cuando la varibles son privadas se usan: get (escribir) y set (optener el valor).
        }
    }
    //Declaración de la clase Vuelo.
    static class Reserva{
        //Declaración de los atributos de la clases.
        String nombrePasajero;
        String apellidoPasajero;
        String numeroPasaporte;
        Vuelo numerVuelo;
        //Declaración del constructor de la clase.
        public  Reserva(String nombrePasajero, String apellidoPasajero , String numeroPasaporte,Vuelo numerVuelo ) {
            this.nombrePasajero = nombrePasajero;
            this.apellidoPasajero = apellidoPasajero;
            this.numeroPasaporte = numeroPasaporte;
            this.numerVuelo = numerVuelo;
            //cuando la varibles son privadas se usan: get (escribir) y set (optener el valor).
        }
        //Declaración del método para hacer la reserva 
        public void infoReserva(){
            System.out.println("---------------------------");
            System.out.println("Información de su reserva");
            System.out.println("---------------------------");
            System.out.println("Nombre del pasajero: " + this.nombrePasajero);
            System.out.println("Apellido del pasajero: " + this.apellidoPasajero);
            System.out.println("Numero del pasaporte: " + this.numeroPasaporte);
            System.out.println("Numero de vuelo: "+ this.numerVuelo.numeroVuelo);
            System.out.println("Lugar de origen: "+ this.numerVuelo.origen);
            System.out.println("Lugar de destino: "+ this.numerVuelo.destino);
            System.out.println("---------------------------");
        }
    }

   public static void main(String[] args) {
    //definir los vuelos de la reserva 
    Vuelo[] vuelos = new Vuelo[3];// los [] son una raiz 
    //los vuelos creados y declarados
    vuelos[0] = new Vuelo("1233456","Buenos Aires","santiago",40);
    vuelos[1] = new Vuelo("1254889","Málaga","Madrid",20);
    vuelos[2] = new Vuelo("1364784","Barcelona","Las palmas",30);
    //muestro al usuario la informacion de los 3 vuelos
    for(int i = 0; i < vuelos.length; i++){
        System.out.println("Vuelo"+ (i + 1) + "---------------");
        System.out.println("Numero de vuelo: " + vuelos[i].numeroVuelo);
        System.out.println("Origen del vuelo: " + vuelos[i].origen);
        System.out.println("Destino de vuelo: " + vuelos[i].destino);
        System.out.println("Asienetos disponibles:" + vuelos[i].asientosDisp);
        System.out.println("");
    }
    //el usuario elege el vuelo para hacer la reserva
    System.out.println("Elija un vuelo: ");
    int opcionVuelo = .nextInt();
    System.out.println("Introduzca su nombre: ");
    String nombrePasajeo = entrada.nextInt();
    System.out.println("Introduzca su apellido: ");
    String apellidoPasajero = entrada.nextInt();
    System.out.println("Introduzca su nnumero de pasaporte: ");
    String numeroPasaporte = entrada.nextInt();

    Reserva nuevaReserva = new Reserva(nombrePasajeo, apellidoPasajero,numeroPasaporte,vuelos[opcionVuelo-1]);
    vuelos[opcionVuelo-1].asientosDisp=vuelos[opcionVuelo-1].asientosDisp-1;

    System.out.println("Su reserva ha sido confirmada. Sus datos son:");
    nuevaReserva.infoReserva();
   }

}
