public class waveformprintingelements {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // Waveform Printing
        System.out.println("Waveform Printing");
        for (int i = 0; i < matrix.length; i++){
            if (i % 2 == 0){
                for ( int j = 0; j < matrix.length;j++){
                    System.out.print(matrix[i][j]);
                }
            }else{
                for (int j = matrix.length - 1; j >= 0; j--){
                    System.out.print(matrix[i][j]);
                }
            }
        }
        // Upside Down WaveForm 
        System.out.println("Upside Down WaveForm");
        for ( int i = 0; i < matrix.length; i++){
            if (i % 2 == 0){
                for ( int j = 0; j < matrix[i].length;j++){
                    System.out.print(matrix[j][i]);
                }
            }else{
                for (int j = matrix[i].length - 1; j >= 0; j--){
                    System.out.print(matrix[j][i]);
        }
    }
}
        // Reverse Order
        System.out.println("Reverse Order");
        for ( int i = 0; i < matrix.length; i++){
            for ( int j = matrix.length -1; j>=0; j--){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        } 
    }
}
    