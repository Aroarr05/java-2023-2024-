package matriz;
public class sudoku {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("El Sudoku resuelto es: \n**********************");

        int[][] sudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Comprobar si hay algun número repetido: \n***************************************");

        int[]num={1,2,3,4,5,6,7,8,9};
        boolean[]prueba = new boolean[9];

      for (int i = 0; i < prueba.length; i++) {
        for (int j = 0; j < prueba.length; j++) {
            
        }
      }
 


        System.out.println(" ");
    }
}
