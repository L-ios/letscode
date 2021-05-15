package com.lib8.leetcodecn.primary.array;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return;
        }
        // 对角线反转
        int[][] newMatrix = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                newMatrix[j][i] = matrix[row-i-1][row -j-1];
            }
        }
        // 上下反转
        for (int i = 0; i < row; i++) {
            System.arraycopy(newMatrix[row - i-1], 0, matrix[i], 0, row);
        }
        System.out.printf("xxxx");


    }
}
