package com.lib8.leetcodecn;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/1
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        List<Integer> pre = result;
        for (int i = 0; i <= rowIndex; i++) {
            pre = result;
            result = new ArrayList<>(i+1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.add(1);
                } else {
                    result.add(pre.get(j) + pre.get(j-1));
                }
            }

        }
        return result;
    }
}
