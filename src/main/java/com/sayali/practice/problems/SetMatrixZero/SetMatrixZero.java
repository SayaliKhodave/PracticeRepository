package com.sayali.practice.problems.SetMatrixZero;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        // Your code goes here

        boolean firstCol = false;
        boolean firstRow = false;
        //traverse matrix to find zeroes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) firstRow = true;
                    if (j == 0) firstCol = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //set inner matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        //set firstRow and firstCol
        if (firstRow) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstCol) {
            for (int i=0; i< matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }




    }
}