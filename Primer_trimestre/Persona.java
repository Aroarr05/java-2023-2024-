//Creamos la clase persona que tiene que tener un nombre, apequido y saludo.Pedir el 3 pesronas y saludar. 

import java.util.Scanner;

public class Persona {

static class PersonaApp {
  private String nombre;
  private String apellido;
  String dni;
  int edad;

public PersonaApp(String nombre, String apellido, String dni, int edad){
this.nombre = nombre;
this.apellido = apellido;
this.dni = dni;
this.edad = edad;

}
public void setNombre(String nombre) {
  this.nombre = nombre;
}
public String getNombre(){
  return this.nombre;
}

public void setApellido(String apellido) {
  this.apellido = apellido;
}
public String getApellido(){
  return this.apellido;
}

 public void setDni(String dni) {
  this.dni = dni;
}
public String getDni(){
  return this.dni;
}

 public void setEdad(int edad) {
  this.edad = edad;
}
public int getEdad(){
  return this.edad;
}

 
 public void Saluda(){
  System.out.println(" Hola me llamo: "+this.nombre + " " + this.apellido + this.dni + this.edad);
 }

 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  PersonaApp[] personas = new PersonaApp[1];
  String no, ap, dn;
  int ed;

  for(int i = 0 ; i < 3 ; i++ ){
    System.out.print("Introduzca el nombre de la persona "+(i+1) + " : ");
    no = entrada.next();
    System.out.print("Introduzca el apellido de la persona " + (i+1) + " : ");
    ap = entrada.next();
    System.out.print("Introduzca el DNI "+(i+1) + " : ");
    dn = entrada.next();
    System.out.print("Introduzca la edad "+(i+1) + " : ");
    ed = entrada.nextInt();
    personas[i] = new PersonaApp(no, ap, dn, ed);
  }
  personas[0].Saluda();
  personas[2].Saluda();
  personas[1].Saluda();

  personas[0].setNombre("Pedro");
  personas[0].Saluda();

  System.out.println(personas[0].getNombre());

  personas[0].setApellido("rivas");
  personas[0].Saluda();

   System.out.println(personas[0].getNombre());

  personas[0].setDni("478466998536");
  personas[0].Saluda();

 System.out.println(personas[0].getNombre());

  personas[0].setEdad(11);
  personas[0].Saluda();

   System.out.println(personas[0].getNombre());

 entrada.close();
 }
 
}
    
}
