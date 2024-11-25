//Autor: Aroa Rivas Rios 

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 
public class Biblioteca {
    // DECLARACION CLASE LIBRO
    static class Libro {
    // DECLARACION DE LOS ATRIBUTOS DE LA CLASE LIBRO
        String nom;
        String autor;
        String editorial;
        LocalDate fechaPubli;
    // DECLARACION DEL CONTRUCTOR DE LA CLASE LIBRO
        public Libro(String nom, String autor, String editorial, LocalDate fechaPubli){
            this.nom = nom;
            this.autor = autor;
            this.editorial = editorial;
            this.fechaPubli = fechaPubli;
        }
    }
 
    // DECLARACION CLASE USUARIOS
    static class Usuario {
    // DECLARACION DE LOS ATRIBUTOS DE LA CLASE USUARIOS
        String nomusuario;
        String apeusuario;
        Libro[] librospretados;
        LocalDateTime[] fechapretamo;
    // DECLARACION DEL CONTRUCTOR DE LA CLASE USUARIO
        public Usuario(String nomusuario, String apeusuario,  Libro[] librospretados,  LocalDateTime[] fechapretamo){
            this.nomusuario = nomusuario;
            this.apeusuario = apeusuario;
            this.librospretados = librospretados;
            this.fechapretamo = fechapretamo;
        }
        //
        public void mostrarlibrosprestados(){
             DateTimeFormatter formatoPubli = DateTimeFormatter.ofPattern("yyyy");
            DateTimeFormatter formatoPrestamo= DateTimeFormatter.ofPattern("'A las ' dd 'del mes' M 'de' yyyy. 'A las' kk 'horas'.");
    
            System.out.println("lIBROS PRESTADOS: ");
            System.out.println("------------------");
            System.out.println("Nombre de Usuario: " +this.nomusuario+this.apeusuario);
            
           for(int i =0; i<this.librospretados.length;i++){

            if(this.librospretados[i] != null){

            System.out.println("Libro " + i+1 + "------------------");
                System.out.print("Titulo: ");
            System.out.println(this.librospretados[i].nom);
                System.out.print("Autor: ");
            System.out.println(this.librospretados[i].autor);
                System.out.print("Editorial: ");
            System.out.println(this.librospretados[i].editorial);
                System.out.print("Fecha Publicacion: ");
            //System.out.printf("%tY\n",this.librospretados[i].fechaPublicación);
            System.out.println(this.librospretados[i].fechaPubli.format(formatoPubli));
             System.out.print("El libro fue prestado: ");
            System.out.println(this.fechapretamo[i].format(formatoPrestamo));

            //System.out.printf("%td/%tm%ty a las %tR",this.fechaPrestamo[i],this.fechaPrestamo[i],this.fechaPrestamo[i]);
           //%td dia %tm mes %ty año
           }
           }
        }
    }
 
    public static void main(String[] args) {
        // CREACION DE UNA ARRAY CON LOS DATOS DE LOS LIBROS
        Libro[] l = new Libro[4];
        l[0] = new Libro("ALAS DE SANGRE", "REBECCA","PLANETA", LocalDate.of(2023,4,21));
        l[1] = new Libro("UN DESTINO DE FURIA Y SANGRE", "PACA","PLANETA", LocalDate.of(2022,5,2));
        l[2] = new Libro("PROTEGIDA", "PEPE","STORY", LocalDate.of(2020,9,1));
        l[3] = new Libro("ACOTAR", "LUIS","PINGUINO", LocalDate.of(2021,1,12));
        // MOSTRAR A LOS USARIOS LOS LIBROS
        for(int i = 0; i<l.length; i++){
            System.out.println("****** Opcion: " +(i+1)+"*******");
            System.out.println("Titulo: "+ l[i].nom);
            System.out.println("Autor: "+ l[i].autor);
            System.out.println("Editorial: "+ l[i].editorial);
            System.out.println("Fecha de Publicacion: "+ l[i].fechaPubli);
            System.out.println(" ");
        }
        // DATOS DEL USUARIO
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero del libro que quiere pedir prestado: ");
        int opcion = entrada.nextInt();
        System.out.println("Nombre: ");
        String nomusuario = entrada.next();
        System.out.println("Apellidos: ");
        String apeusuario = entrada.next();
 
    // HACER QUE EL USUARIO PIDA NADA MAS DOS LIBROS
        Libro[] librosUser1 = new Libro[2];
        librosUser1 [0] = l[opcion-1];
        // FECHA DE PEDIR PRESTADO UN LIBRO
        LocalDateTime[] fechapretamoUser1 = new LocalDateTime[2];
        fechapretamoUser1[0] = LocalDateTime.now();
        Usuario user1 = new Usuario(nomusuario,apeusuario,librosUser1, fechapretamoUser1);
        
        user1.mostrarlibrosprestados();
        entrada.close();
    }
   
 
}
  
