package com.lib8.leetcodecn;

import java.util.Arrays;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/9
 */
public class LastStoneWeightII {
    public int lastStoneWeightII(int[] stones) {
        Arrays.sort(stones);
        int[] pluses = new int[stones.length];
        int[] subs = new int[stones.length];
        pluses[0] = stones[0];
        subs[0] = stones[0];
        for (int i = 1, j=0; i < stones.length; i++, j++) {
            pluses[i] = Math.min(subs[j], pluses[j]) + stones[i];
            subs[i] = Math.abs(Math.max(pluses[j], subs[j]) - stones[i]);
        }
        return Math.min(subs[stones.length-1], pluses[stones.length-1]);
        //        return lastStoneWeightII(stones, stones[0], 1);
    }

    public int lastStoneWeightII(int[] stones, int preSum, int index) {
        if (stones.length == index) {
            return preSum;
        }
        return Math.min(lastStoneWeightII(stones, preSum+stones[index], index+1),
                lastStoneWeightII(stones, Math.abs(preSum-stones[index]), index+1));
    }
}
