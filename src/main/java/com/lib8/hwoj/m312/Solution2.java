package com.lib8.hwoj.m312;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目有若干个任务，每个任务的完成情况信息为 [start, end， workCount]
 *                                     开始时间， 结束时间，投入的人数
 * 求投入人数最多的时间段
 */
public class Solution2 {
    /**
     * 思路，将二位数组通过对象构造为一维数组（降维），并以开始时间排序
     * 合并后通过栈进行数组去重
     * 根据数组获取结果
     * @param persons
     * @return
     */
    public static int[][] busyTimes(int[][] persons) {
        int[] cnfLogs = new int[100002];

        for (int[] person : persons) {
            cnfLogs[person[0]] += person[2];
            cnfLogs[person[1]-1] -= person[2];
        }

        int curCnt = 0;
        int maxCnt = 0;

        int tStart = -1;
        int tEnd = -1;
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < cnfLogs.length; i++) {
            curCnt += cnfLogs[i];

            if (curCnt > maxCnt) {
                maxCnt = curCnt;
                result.clear();
                tStart = tEnd =i;
            } else if (curCnt < maxCnt) {
                if (tStart != -1) {
                    result.add(new int[]{tStart, tEnd});
                    tStart = -1;
                }
            } else {
                if (tStart == -1) {
                    tStart = i;
                }
                tEnd = i;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public class WorkInfo {
        private int start;
        private int end;
        private int workMans;

        public WorkInfo(int start, int end, int workMans) {
            this.start = start;
            this.end = end;
            this.workMans = workMans;
        }

        public int[] toArrays() {
            return new int[]{start, end, workMans};
        }
    }
}


