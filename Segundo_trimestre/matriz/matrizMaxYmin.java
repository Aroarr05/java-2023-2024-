package matriz;



public class matrizMaxYmin {
    public static void main(String[] args) {
        int[][] matriz={
        {1,2,3},
        {4,5,6},
        {7,8,9}    
        };
        
        int max = matriz [0][0];
        int min = matriz [0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz [i][j]>max) {
                    max = matriz [i][j];
                }
                if (matriz[i][j]<min) {
                    min = matriz [i][j];
                }
            }
        }
        System.out.println(" El nº max es: " + max); 
        System.out.println(" El nº min es: " + min); 
        System.out.println(" ");
        




    }
    
}
