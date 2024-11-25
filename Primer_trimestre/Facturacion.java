
//Autor: Aroa Rivas Rios

import java.util.Scanner;

public class Facturacion {

    static class Producto{

        //Declaración de los atributos de clase.
        String nombre;
        double precio;
        int cantidad;
        //Declaración del constructor de la clase.
        public  Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            
            //cuando la varibles son privadas se usan: get (escribir) y set (optener el valor).
        }
    }
    
    static class Factura {

        //Declaración de los atributos de clase. 
        String ListaProductos;
        int CantidadProductos;
        public  Factura(String ListaProductos, int CantidadProductos) {
            this.ListaProductos = ListaProductos;
            this.CantidadProductos = CantidadProductos;
        }
        
    }



}
