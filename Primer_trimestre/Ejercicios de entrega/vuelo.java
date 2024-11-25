import java.util.Scanner;

public class vuelo {
    static class Nvuelo{

        
        int numvuelo;
        String origen;
        String destino;
        String AsientoDisponible;
        public  Nvuelo(int numvuelo, String origen, String destino, String asientodisponible) {
            this.numvuelo = numvuelo;
            this.origen = origen;
            this.destino = destino;
            this.AsientoDisponible = asientodisponible;
        }
        //cuando la varibles son privadas se usan: get (escribir) y set (optener el valor).
        public void setnumvuelo(int numvuelo){
            this.numvuelo = numvuelo;
        }
        public int getnumvuelo(){
            return this.numvuelo;
        }
        public void setorigen(String origen){
            this.origen=origen;
        }
        public String getorigen(){
            return this.origen;
        }
        public void setdestino(String destino){
            this.destino = destino;
        }
        public String getdestino(){
            return this.destino;
        }
        public void setAsientoDisponible(String AsientoDisponible){
            this.AsientoDisponible = AsientoDisponible;
        }
        public String getAsientoDisponible(){
            return this.AsientoDisponible;
        }

        public void datos(){
            System.out.println("Datos del vuelo: " + this.numvuelo + this.origen + this.destino + this.AsientoDisponible);
        }

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Nvuelo[] vuelo = new Nvuelo[1];
  
    int num;
    String ori,des,asi;

    for(int i = 0; i < 1; i++){
       
        System.out.println("El nº de vuelo: ");
        num = entrada.nextInt();
        System.out.println("El origen  del destino: ");
        ori = entrada.next();
        System.out.println("El destino: ");
        des = entrada.next();
        System.out.println("El asientodiponible: ");
        asi = entrada.next();
        vuelo[i] = new Nvuelo(num,ori,des,asi);
    }

    
    vuelo[0].setAsientoDisponible("45,75,8");
    vuelo[0].setdestino("málaga");
    vuelo[0].setorigen("madrid");

    entrada.close();
}

    }
    
}
   
