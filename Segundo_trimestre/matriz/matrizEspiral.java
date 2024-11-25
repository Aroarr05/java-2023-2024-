package matriz;
public class matrizEspiral {
    public static void main(String[] args) {
        System.out.println("matriz espiral");

        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        int valor = 1;
        int inicioFila =0;
        int finFila = filas -1;
        int inicioColumna =0;
        int finColumna = columnas-1;

        while(inicioFila<=finFila&& inicioColumna<=finColumna){
            for (int i = inicioColumna; i <= finColumna; i++){
                espiral[inicioFila][i] valor;
            }
        }

        for (int i = inicioColumna; i<= finColumna; i++) {
            matriz[inicioFila][i]=valor++;
        }
        inicioFila++;

        for (int i = inicioFila; i <= finFila; i++) {
           matriz[i][finColumna]=valor++;
        }
        finColumna--;
    if (inicioFila<=finFila){
        for (int i = finColumna; i >= inicioColumna; i--) {
          matriz[finFila][i]= valor++;     
        }
        finFila--;
    }
    if(inicioColumna<=finColumna){
        for (int i = finFila; i >= inicioFila; i--) {
            matriz[i][inicioColumna]=valor++;
        }
        inicioColumna++;
    }


    }
    
}
