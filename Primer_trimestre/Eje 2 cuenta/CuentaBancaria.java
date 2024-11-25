//Autor: Aroa Rivas Rios

public class CuentaBancaria {
    //DECLARACION DE LA CLASE CUENTA
    static class Cuenta{
        String NumCuenta;
        String Banco;
        String DigiControl;
        String Saldo;
        // DECLARACION DEL CONTRUCTOR DE LA CLASE CUENTA
        public Cuenta(String NumCuenta,String Banco,String DigiControl,String Saldo){
            this.NumCuenta=NumCuenta;
            this.Banco=Banco;
            this.DigiControl=DigiControl;
            this.Saldo=Saldo;
        }
    }
    //DECLARACION DE LA CLASE CLIENTE
    static class Cliente{
        String Nombre;
        String Apellidos;
        int DNI;
        Cuenta NumCuenta;
        // DECLARACION DEL CONTRUCTOR DE LA CLASE CLIENTE
        public Cliente(String Nombre,String Apellidos,int DNI,Cuenta NumCuenta){
            this.Nombre=Nombre;
            this.Apellidos=Apellidos;
            this.DNI=DNI;
            this.NumCuenta=NumCuenta;
        }
    }
    //DECLARACIÓN DE LA CLASE infoBANCO
    static class infoBanco{
        String NomBanco;
        String Oficina;
        Cliente Nombre;
        // DECLARACION DEL CONTRUCTOR DE LA CLASE infoBANCO
        public infoBanco(String NomBanco,String Oficina,Cliente Nombre){
            this.NomBanco=NomBanco;
            this.Oficina=Oficina;
            this.Nombre=Nombre;
        }
    }
    public static void main(String[] args) {
         // CREACION DE UNA ARRAY CON LOS DATOS DE LOS INFO BANCO
         infoBanco[] l = new infoBanco[8];
         l[0] = new infoBanco("1245","5464","54","1677642357");
         l[1] = new infoBanco("UniCaja","oficina2",);
         l[2] = new infoBanco("Santander","oficina1",);
         l[3] = new infoBanco("UniCaja","oficina2",);
         l[4] = new infoBanco("Santander","oficina1",);
         l[5] = new infoBanco("UniCaja","oficina2",);
         l[6] = new infoBanco("Santander","oficina1",);
         l[7] = new infoBanco("UniCaja","oficina2",);



    }
}
