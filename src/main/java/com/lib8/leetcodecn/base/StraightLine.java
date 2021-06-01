package com.lib8.leetcodecn.base;/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/8
 */
public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int baseVertX = coordinates[0][0] - coordinates[1][0];
        int baseVertY = coordinates[0][1] - coordinates[1][1];

        for(int i = 2; i < coordinates.length; i++) {
            int vertX = coordinates[i][0] - coordinates[0][0];
            int vertY = coordinates[i][1] - coordinates[0][1];
            if (vertX * baseVertY != vertY * baseVertX) {
                return false;
            }
        }

        return true;
    }
}
