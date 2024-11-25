
import java.util.Scanner;

public class CochesApp {  

    static class Coche{
        String modelo;
        int anno;
        double tarifa;
       public Coche(String modelo,int anno,double tarifa){
            this.modelo= modelo;
            this.anno= anno;
            this.tarifa= tarifa;
        }
    }

    static class AgenciaAlquiler{
        Coche[] coches;
        boolean[] alquilado;
        public AgenciaAlquiler( Coche[] coches,boolean[] alquilado){
            this.coches= coches;
            this.alquilado= alquilado;
        }
    }

    static class Cliente{
        String  Nombre;
        String Apellido;
        Coche cocheAlquilado;
        int diasAlquilado;
        public  Cliente(String Nombre,String Apellido,Coche cocheAlquilado,int diasAlquilado){
            this.Nombre= Nombre;
            this.Apellido= Apellido;
            this.cocheAlquilado= cocheAlquilado;
            this.diasAlquilado= diasAlquilado;
        }
    }

    public static void main(String[] args) {
    Coche[] cocheDisponibles= new Coche[3];
    cocheDisponibles[0]= new Coche("Seat",2010,20.5);
    cocheDisponibles[1]= new Coche("Renault",2000,40.5);
    cocheDisponibles[2]= new Coche("Ford",2015,25.6);

    boolean[]alquilado= new boolean[3];
    alquilado[0]= true;
    alquilado[1]= false;
    alquilado[2]= false;

    AgenciaAlquiler agencia= new AgenciaAlquiler(cocheDisponibles, alquilado);

        
        System.out.println("..............");
        for(int i=0; i<agencia.coches.length; i++){
          
            if(agencia.alquilado[i]==false){
                System.out.print((i+1)+".-"+agencia.coches[i].modelo+"|");
                System.out.print(agencia.coches[i].anno+"|");
                System.out.print(agencia.coches[i].tarifa+"€");
            }
        } 

        Scanner entrada= new Scanner(System.in);
        System.out.print("¿Qué coche elije?: ");
        //opc =opccion
        int opc = entrada.nextInt();
        System.out.print("¿Por cuántos días?: ");
        int dias= entrada.nextInt();
        System.out.print("Introduzac su nombre: ");
        String nombreCliente = entrada.next();
        System.out.print("Introduzac su apellido: ");
        String apellidoCliente = entrada.next();

        Cliente cliente1= new Cliente(nombreCliente, apellidoCliente, agencia.coches[opc-1],dias);
        agencia.alquilado[opc-1]= true;
        
        System.out.println("Acaba de alquilar un coche "+agencia.coches[opc -1].modelo+"por"+ dias+"dias");
        System.out.println("El ");
        entrada.close();
    }

}
