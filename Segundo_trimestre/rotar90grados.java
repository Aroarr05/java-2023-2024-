public class rotar90grados {

    public static void main(String[] args) {
        int [][] matrizOriginal = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("\nMatriz original\n...............");  
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal.length; j++) {
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        int longFilas = matrizOriginal.length;
        int longColumnas = matrizOriginal[longFilas - 1].length;
        int[][] matrizNueva = new int[longColumnas][longFilas];

        for(int i = 0; i < matrizOriginal.length; i++)
        {
            for(int j =0 ; j < matrizOriginal[i].length; j++) 
            {
                matrizNueva[j][i] = matrizOriginal[i][j];
            }
        }
        System.out.println("\nMatriz 90 grados\n................");                                    
        for(int i = 0; i < matrizNueva.length; i++)
        {
            for(int j = matrizNueva.length-1 ; j >= 0 ; j--) 
            {
                System.out.print(matrizNueva[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");



    }
}