public class Ch10_MultidimensionalArray {
    public static void main(String[] args) {

        // Declaring and initializing a 2D array (3 rows and 3 columns)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Displaying the elements of the 2D array
        System.out.println("Matrix Elements:");

        // Outer loop for rows
        for (int i = 0; i < matrix.length; i++) {

            // Inner loop for columns
            for (int j = 0; j < matrix[i].length; j++) {

                // Printing each element
                System.out.print(matrix[i][j] + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }

}
