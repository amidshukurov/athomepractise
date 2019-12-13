package athomepractise;


public class Array {
    public static void main(String[] args) {
        int idx1=5, idx2=6;
        int[][] matrix = new int[idx1][idx2];
        //This is array filling
        for (int i = 0; i <idx1; i++) {
            for (int j = 0; j <idx2 ; j++) {
             matrix[i][j]=j;
            }
        }
        System.out.println("Original array");
        for (int i = 0; i <idx1 ; i++) {
            for (int j = 0; j <idx2 ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\nPrinting array in right direction\n");
        // Right = 0, Left = 1;
        PrintArray(matrix,0);



    }
/*
    public enum Direction{
        Right,
        Left
    }
*/

  public static void PrintArray (int[][] matrix, int direction){
        int idx1 = matrix.length;
        int idx2 = matrix[0].length;

        for(int i = 0 ; i < idx1*idx2 ; i++) {
            int index1 = i/idx2;
            int index2 = i%idx2;
            int zigzag=(Math.abs(index1%2-direction))*(idx2-1);
            System.out.print(matrix[index1][Math.abs(index2-zigzag)]+" ");
            if(index2==5) System.out.println();//this is only for new line after each row
        }
    }

}
