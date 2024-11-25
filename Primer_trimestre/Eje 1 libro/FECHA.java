import java.time.LocalDateTime;

public class FECHA {
    
    public static void main(String[] args) {
        LocalDateTime Fecha = LocalDateTime.now();
        System.out.printf("el dia %td de me %tB de %tY a las %tH horas %tM minutos" ,Fecha,Fecha,Fecha,Fecha,Fecha);
    }
}
