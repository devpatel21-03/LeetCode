class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstrow = false;
        boolean firstcol = false;

        // Check if first row needs to be zeroed
        for (int col = 0; col < m; col++) {
            if (matrix[0][col] == 0) {
                firstrow = true;
            }
        }

        // Check if first column needs to be zeroed
        for (int row = 0; row < n; row++) {
            if (matrix[row][0] == 0) {
                firstcol = true;
            }
        }

        // Use first row and column as markers
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < m; col++) {
                if (matrix[row][col] == 0) {
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < m; col++) {
                if (matrix[0][col] == 0 || matrix[row][0] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Zero first row if needed
        if (firstrow) {
            for (int col = 0; col < m; col++) {
                matrix[0][col] = 0;
            }
        }

        // Zero first column if needed
        if (firstcol) {
            for (int row = 0; row < n; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}
