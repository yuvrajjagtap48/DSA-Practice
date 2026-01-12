package PraticeS;

public class TransposeMatrix {

    public static void helper(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int [][] transposArray = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transposArray[j][i] = arr[i][j];
            }
        }
        System.out.println("Transposed matrix");
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(transposArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {4, 5},
            {7, 9}
        };
        System.out.println("original 2D matrix");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        helper(matrix);
    }
}
