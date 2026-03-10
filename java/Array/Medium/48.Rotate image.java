class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while(left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
/*
Logic to rotate an 
𝑛
×
𝑛
n×n matrix 90° clockwise (in-place):

1️⃣ Transpose the matrix
Swap elements across the main diagonal.

matrix[i][j]↔matrix[j][i]

This converts rows into columns.

2️⃣ Reverse each row
After transposing, reverse every row of the matrix.
Rotate 90° clockwise = Transpose + Reverse each row */