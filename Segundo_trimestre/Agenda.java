
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

class Evento {
    private LocalTime hora;
    private String evento;

    public Evento(LocalTime hora, String evento) {
        this.hora = hora;
        this.evento = evento;
    }

    public LocalTime getTime() {
        return hora;
    }

    public String getDescription() {
        return evento;
    }
}
public class Agenda {
   
    public static void main(String[] args) {

        Map<LocalDate, List<Evento>> evento = new HashMap<>();
        TreeMap<LocalDate,ArrayList<Evento>> agenda = new TreeMap<LocalDate,ArrayList<Evento>>();

        Scanner entrada = new Scanner(System.in);
        boolean salir = true;
        int opcion;

        while (salir) {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir Evento");
            System.out.println("2. Eliminar Evento");
            System.out.println("3. Mostrar Día");
            System.out.println("4. Mostrar Agenda");
            System.out.println("5. Salir");

            System.out.print("Ingrese su elección: ");
            opcion = entrada.nextInt();

            System.out.println(" ");

            switch (opcion) {
                case 1:
                    addEvent(evento);break;
                case 2:
                    removeEvent(evento); break;
                case 3:
                    showDate(evento);break;
                case 4:
                    showAll(evento);break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println(" ");
                    break;
            }

        }
        entrada.close();
    }

    static void removeEvent( Map<LocalDate, List<Evento>> evento ){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" ");
    }
    static void addEvent( Map<LocalDate, List<Evento>> evento ){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" ");
    }
    static void showDate( Map<LocalDate, List<Evento>> evento ){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" ");
    }
    static void showAll( Map<LocalDate, List<Evento>> evento ){
        Scanner entrada = new Scanner(System.in);
        System.out.print(" ");
    }

}
