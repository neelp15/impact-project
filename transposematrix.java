import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
       int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // for (int i = 0; i < matrix.length; i++){
        //     for (int j= 0; j < matrix.length; j++){
        //         System.out.print(matrix[j][i] + " ");
        //     }
        //     System.out.println();
        // }
        // int sum = 0;
        // for (int i = 0; i < matrix.length; i++){
        //     for ( int j= 0; j<matrix.length; j++){
        //         if (i==j ){
        //             sum += matrix[i][j];
        //         }else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("Sum of diagonal elements: " + sum);
        for (int i = 0; i < matrix.length; i++){
            for (int j= 0; j < matrix.length; j++){
                if (i==j && i+j == matrix.length-1){
                    System.out.print();
            }
            System.out.print(matrix[i][j] + " ");
        }
            System.out.println();
        }

          
    }
    
}
