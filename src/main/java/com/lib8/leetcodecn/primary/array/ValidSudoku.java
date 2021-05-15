package com.lib8.leetcodecn.primary.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> nums = new HashSet<>();
        int numCount = 0;
        for (char[] chars : board) {
            nums.clear();
            numCount = 0;
            for (char ch : chars) {
                if (ch != '.') {
                    nums.add(ch);
                    numCount++;
                }
            }

            if (nums.size() != numCount) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            nums.clear();
            numCount =0;
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    nums.add(board[j][i]);
                    numCount++;
                }
            }
            if (nums.size() != numCount) {
                return false;
            }
        }
        int[] index = new int[]{0, 3, 6};
        for (int i : index) {
            for (int j : index) {
                if (!validNine(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean validNine(char[][] board, int line, int col) {
        Set<Character> nums = new HashSet<>();
        int numCount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char ch = board[line+i][j+col];
                if (ch != '.') {
                    nums.add(ch);
                    numCount++;
                }
            }
        }

        return nums.size() == numCount;
    }
}
