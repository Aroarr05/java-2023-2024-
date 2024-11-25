



public class incriptacion {
    public static void main(String[] args) {

        System.out.println(" ");

        String palabra = "ESTO ES SECRETO";
        int key=5;
        int columna= key;
        int filas=palabra.length()/key;
        
        if(palabra.length() % key != 0){
            filas++;
        }
        char[][] matriz =new char[filas][columna];


        int contador=0;
        for(int i = 0; i < matriz.length; i++){
            for(int j =0 ; j < matriz[i].length; j++) 
            {
                matriz [i][j]=palabra.charAt(contador);
                contador++;
                
            }
        }
        int longFilas = matriz.length;
        int longColumnas = matriz[longFilas - 1].length;
        char[][] matrizTranspuesta = new char[longColumnas][longFilas];

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j =0 ; j < matriz[i].length; j++) 
            {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        for(int i = 0; i < matrizTranspuesta.length; i++)
        {
            for(int j =0 ; j < matrizTranspuesta[i].length; j++) 
            {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println();
        }
        String mensajeCifrado ="";
        for(int i = 0; i < matrizTranspuesta.length; i++)
        {
            for(int j =0 ; j < matrizTranspuesta[i].length; j++)
            {
                mensajeCifrado= mensajeCifrado + matrizTranspuesta[i][j];
            }
            System.out.println();
        }    
        System.out.print(mensajeCifrado);  
        System.out.println(" ");
        System.out.println(" ");


        for(int i = 0; i < matriz.length; i++)
        {
            for(int j =0 ; j < matriz[i].length; j++) 
            {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j =0 ; j < matriz[i].length; j++) 
            {
                System.out.print(matriz[i][j] );
            }
            System.out.println();
        }
        String mensafinal ="";
        for(int i = 0; i < matriz.length; i++)
        {
            for(int j =0 ; j < matriz[i].length; j++)
            {
                mensajeCifrado= mensajeCifrado + matriz[i][j];
            }
            System.out.println();
        }    
        System.out.print(mensafinal);
    }

}
