//Autor: Aroa Rivas Rios
 
import java.io.*;
import java.util.Scanner;
import java.util.*;
 
//Construcción de la clase Asignatura
class Asignatura{
    private String nombre;
    //Constructor para inicializar los atributos 
    public Asignatura(String nombre){
        this.nombre = nombre;
    }
    //Método get de Nombre
    public String getNombre(){
        return this.nombre;
    }
    //Método set de Nombre
    public String setNombre(){
        return this.nombre;
    }
}
//Construcción de la clase Alumno
class Alumno {
    private String nombre;
    private String curso;
    private HashMap <Asignatura,Double> notas = new HashMap<>();
    //costructor para inicializar los atributos
    public Alumno(String nombre,String curso,HashMap <Asignatura,Double> notas){
        this.nombre = nombre;
        this.curso = curso;
        this.notas = notas;
    }
    //método get del Nombre 
    public String getNombre(){
        return this.nombre;
    }
    //Método get del Curso
    public String getCurso(){
        return this.curso;
    }
    //Método get de las notas
    public HashMap<Asignatura,Double> getNotas(){
        return this.notas;
    }
    //Método set del nombre
    public String setNombre(){
        return this.nombre;
    }
    //Método set del curso
    public String setCurso(){
        return this.curso;
    }
    //Método set de las notas
    public HashMap<Asignatura,Double> setNotas(){
        return this.notas;
    }
    //Método para representar el objeto Alumno como una cadena de texto
    @Override
    public String toString(){
        return "Nombre del alumno: " + nombre + ", su curso es: " + curso + ". Su nota es: " + notas;
    }
}
//Creamos la clase
public class GestorSistema{
    //Creamos el main
    public static void main(String[] args) {
        //HashMap donde vamos a almacenar los datos 
        HashMap <Asignatura,Double> datos= new HashMap<>();
        //Arraylist de alumno
        ArrayList <Alumno> listaAlumno = new ArrayList<>(); 
        //Creamos un scanner para pedir por pantalla
        Scanner entrada = new Scanner(System.in);
        // Variable para controlar el bucle del menú
        boolean salir = false;
 
        while (!salir){
            //Menú principal
            System.out.println("\n----Menú----");
            System.out.println("1. Añadir alumno.");
            System.out.println("2. Mostrar alumno.");
            System.out.println("3. Eliminar alumno.");
            System.out.println("4. Añadir asignatura.");
            System.out.println("5. Mostrar asignatura.");
            System.out.println("6. Eliminar asgnatura.");
            System.out.println("7. Asignar y mofificar notas de los alumnos en sus asignaturas.");
            System.out.println("8. Guardar los datos en un fichero binario.");
            System.out.println("9. Cargar los datos en un fichero binario.");
            System.out.println("10. Salir");
 
            System.out.println("Ingrese su elección: ");
            //Leer la opcion del usuario
            int opcion = entrada.nextInt();
            //Limpiar la entrada 
            entrada.nextLine();
           
            switch (opcion) {
                case 1:
                    añadirAlumno(datos,entrada,listaAlumno);
                    break;
                case 2:
                    mostrarAlumno(listaAlumno);
                    break;
                case 3:
                    eliminarAlumno(datos,entrada);
                    break;
                case 4:
                    añadirAsignatura(datos,entrada);
                    break;
                case 5:
                    mostrarAsignatura(datos,entrada);
                    break;
                case 6:
                    eliminarAsignatura(datos,entrada);
                    break;
                case 7:
                    asignarModificar(datos);
                    break;
                case 8:
                    guardarFichero(datos);
                break;
                case 9:
                    cargarFichero(datos);
                break;
                case 10:
                    //Salir del bucle y terminar el programa
                    salir = true;
                    break;        
                default:
                    System.out.println("Error: Opción no válida. ");
                    break;
            }
        }
    }
    //Método para añadir al alumno
    public static void añadirAlumno(HashMap <Asignatura,Double> datos,Scanner entrada,ArrayList <Alumno> listaAlumno ){
        System.out.println("Nombre del alumno: ");
        String nombre = entrada.nextLine();
        System.out.println("Introduce el curso:");
        String curso = entrada.nextLine();
        System.out.println("Introduce el nombre de la asignatura:");
        String asignatura= entrada.nextLine();
        for (Map.Entry<Asignatura,Double> nuevo : datos.entrySet()) {
            if(nuevo.getKey().getNombre().equals(asignatura)){
            System.out.println("Introduce la nota: ");
            Double valor = entrada.nextDouble();
            datos.put(nuevo.getKey(),valor);
            Alumno alumno = new Alumno(nombre, curso, datos);
           listaAlumno.add(alumno);
            }else{
                System.out.println("ERROR NO SE ENCUNTRA NADA.");
            }
        }
    }
    //Método para mostrar al alumno
    public static void mostrarAlumno(ArrayList <Alumno> listaAlumno){
        for (Alumno nuevo : listaAlumno) {
            System.out.println(nuevo);
        }
    }
    //Método para eliminar un alumno
    public static void eliminarAlumno(HashMap <Asignatura,Double> datos,Scanner entrada){
       System.out.println("Introduce el nombre del alumno: ");
       String nombre = entrada.nextLine();
       for (Alumno nuevo : listaAlumno) {
        if(nuevo.getNombre().equals(nombre)){
            listaAlumno.remove(nombre);
           }else{
           System.out.println("No se encuntra el nombre ");
        }
       }
    }
    //Método para añadir la asignatura
    public static void añadirAsignatura(HashMap <Asignatura,Double> datos,Scanner entrada){
        System.out.println("Introduce el nombre de la asignatura: ");
        String nombre = entrada.nextLine();
        System.out.println("Introduce la nota:");
        String nota = entrada.nextLine();
        for (Map.Entry<Asignatura,Double> nuevo : datos.entrySet()) {
            if (nuevo.getKey().getNombre().equals(nota)) {
                

            }else{
    
            }
        }
    }
    //Método para mostrar la asignatura 
    public static void mostrarAsignatura(HashMap <Asignatura,Double> datos,Scanner entrada){
 
    }
    //Método para eliminar la asignatura
    public static void eliminarAsignatura(HashMap <Asignatura,Double> datos,Scanner entrada){
 
    }
    //Método para asignar y modificar 
    public static void asignarModificar(HashMap <Asignatura,Double> datos,Scanner entrada){
 
    }
    //Método para guardar los ficheros 
    public static void guardarFicheros(HashMap <Asignatura,Double> datos,Scanner entrada){
 
    }
    //Método para cargar los ficheros 
    public static void cargarFichero(HashMap <Asignatura,Double> datos,Scanner entrada){
 
    }
}