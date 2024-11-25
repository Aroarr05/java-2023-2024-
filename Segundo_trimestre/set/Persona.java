package set;
import java.util.*;

class Persona implements Comparable<Persona>{
    private String Nombre;
    private int Edad;

    public Persona(String nombre, int edad) {
        this.Nombre = nombre;
        this.Edad = edad;
    }


public String getNombre(){
    return Nombre;
}

public int getEdad(){
    return Edad;
}

@Override
public int compareTo(Persona otrasPersonas){
    if(this.Edad == otrasPersonas.Edad){
        return 0;
    }
    if(this.Edad > otrasPersonas.Edad){
        return 1;
    }
    if(this.Edad < otrasPersonas.Edad){
        return -1;
    }
        //return Integer.compare(this.Edad, otrasPersonas.Edad){
        // return this.nombre.compareTo(otraPersona.nombre);
    }

@Override
public String toString(){
    return "Me llamo";

}
}

