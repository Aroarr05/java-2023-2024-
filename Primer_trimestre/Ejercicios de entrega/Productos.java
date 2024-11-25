
//Autor: Aroa Rivas Rios

//Crea una clase Producto con atributos como nombre, precio y cantidad en stock.
//Luego, crea una clase Factura que tenga una lista de productos comprados, la cantidad de cada producto y métodos para calcular el total de la factura.

import java.util.ArrayList;
import java.util.Scanner;


public class Productos{

  //Declaración de la clase producto.
  static class Producto{
    //Declaración de los atributos del productos.
    String nombre;
    double precio;
    int cantidadEnStock;

    //Declaración del conductor del producto.
    public Producto(String nombre,double precio,int cantidadEnStock){
      this.nombre = nombre;
      this.precio = precio;
      this.cantidadEnStock = cantidadEnStock;
    }
  }
  //Declaración de la clase factura.
  static class Factura{
    ArrayList<Producto> lista;
    ArrayList<Integer> cantidadProducto;

    //Declaración del constructor, le paso un array variable de productos y de cantidad de producto.
    public Factura(ArrayList<Producto> lista, ArrayList<Integer> cantidadProducto) {
      this.lista = lista;
      this.cantidadProducto = cantidadProducto;
      //Guardo el precio del producto + total del producto.
      double total = 0;
      System.out.println("Has comprado ");
      //Este bucle recorro el array lista( tanto lista como cantidadProducto tienen el mismo tamaño) para imprimir los datos del producto y la cantidad
      for (int i = 0; i < lista.size(); i++) {
        System.out.println(lista.get(i).nombre + " X" + cantidadProducto.get(i) + "  Precio Unidad : " + lista.get(i).precio);
        total = total + (lista.get(i).precio * cantidadProducto.get(i));
      }
      System.out.println(" Total: " + total);
    } 
  public static void main(String[] args) {
    //Array para crear 5 productos 
    Producto[] Pro = new Producto[5];
    //Arrays de tamaño variable listas va a ser un array de productos.
    ArrayList<Producto> listas = new ArrayList<Producto>();
    // Le doy valores a los productos.
    Pro[0] = new Producto("Gafas  ", 5.8, 6);
    Pro[1] = new Producto("Libro  ", 7.5, 3);
    Pro[2] = new Producto("Taza   ", 2.7, 1);
    Pro[3] = new Producto("Libreta", 4.6, 3);
    Pro[4] = new Producto("Cascos ", 8.5, 1);
    //Y otro arry para hacer hasta 4 facturas.
    Factura[] f = new Factura[4];
    //Arrays de tamaño variable, uno CantidadProd va a ser la cantidad de un producto comprado.
    ArrayList<Integer> CantidadProd = new ArrayList<Integer>();
    Scanner entrada = new Scanner(System.in);
    //Creo 3 variables para la compra(comp),antidad(cant) y la x el (Si continuo la compra o no).
    int comp, cant;
    String SN;
    //Producto:
    do {  
    System.out.println("--------------------");
    System.out.println("LISTA DE PRODUCTOS: ");
    System.out.println("--------------------");
    for (int i = 0; i <  Pro.length; i++) {
      System.out.println(i + 1 + ".- " + Pro[i].nombre + "Precio Unidad" + Pro[i].precio + "Cantidad Stock" +  Pro[i].cantidadEnStock);
    }
    System.out.println("--------------------");
    System.out.println(" Que quieres comprar: ");
    System.out.println("--------------------");
    comp = entrada.nextInt();
    System.out.println("---------------------------");
    System.out.println(" Cuanto quieres del producto: " +  Pro[comp - 1].nombre);
    System.out.println("---------------------------");
    cant = entrada.nextInt();
    //Compruebo que hay stock.
    if (cant > Pro[comp - 1].cantidadEnStock) {
      System.out.println("--------------------");
      System.out.println(" ERROR!! No hay suficiente " +  Pro[comp - 1].nombre + " en stock. ");
      System.out.println("--------------------");
    } 
      else {
        //Le añado a las listas producto compra y a CantidadProd la cantidad.
        listas.add(Pro[comp - 1]);
        CantidadProd.add(cant);
        //Le quito del producto comprado a la cantidad comprada.
         Pro[comp - 1].cantidadEnStock =  Pro[comp - 1].cantidadEnStock - cant; 
      }
      //Para continuar escribe (SI/NO).
      System.out.println(" Desea continuar (S/N): ");
      SN = entrada.next();
    } 
    while (SN.equals("S"));
    //Crea la factura.
    f[0] = new Factura(listas, CantidadProd);
    }
    
  }
}
