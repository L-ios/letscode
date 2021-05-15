package com.lib8.leetcodecn.primary.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    private RotateMatrix solution = new RotateMatrix();

    @Test
    void rotate() {
        solution.rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
    }
}