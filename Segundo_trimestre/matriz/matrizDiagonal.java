package matriz;
public class matrizDiagonal {
    public static void main(String[] args) {
        int [][] matriz ={
            {1,0,0},
            {0,2,0},
            {0,0,3}
        };
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println();
            }
        }
        //boolean esDiagonal = true;

        /*for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (fila != columna){
                    if (matriz[fila][columna]!=0){
                        esDiagonal = false;
                    }
                }
            }
            }
            if (esDiagonal){
                System.out.println();
            }else{

            }
        }
    }
    
}*/
}