package com.lib8.leetcodecn;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/3
 */
class ThreeSumTest {

    @Test
    void threeSum() {
//        List<List<Integer>> lists = new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> lists = new ThreeSum().threeSum(new int[]{0, 0, 0, 0, 0});

        System.out.println(lists);
    }
}