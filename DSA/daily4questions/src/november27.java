public class november27{
        public void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            // Variables to track if the first row and column should be zero
            boolean firstRowZero = false;
            boolean firstColZero = false;

            // Step 1: Check if the first row or column has any zeros
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }

            for (int j = 0; j < cols; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }

            // Step 2: Use the first row and column as markers
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0; // Mark row
                        matrix[0][j] = 0; // Mark column
                    }
                }
            }

            // Step 3: Set the elements to zero based on markers
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Step 4: Handle the first row and column separately
            if (firstColZero) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][0] = 0;
                }
            }

            if (firstRowZero) {
                for (int j = 0; j < cols; j++) {
                    matrix[0][j] = 0;
                }
            }
        }
    }


