package com.lib8.leetcodecn;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;

/**
 * Project: letscode 349
 *
 * @author: Lionseun Ling
 * @create: 2021/2/18
 */
public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = IntStream.of(nums1).boxed().collect(toSet());
        return IntStream.of(nums2).filter(set1::contains).distinct().toArray();
    }

    public static void main(String[] args) {
        Solutions solution = new Solutions(new int[]{1, 2, 3});
        System.out.println("" + print(solution.shuffle()));
        System.out.println("" + print(solution.reset()));
        System.out.println(print(solution.shuffle()));
    }

    static String print(int[] nums) {
        return IntStream.of(nums).mapToObj(String::valueOf).collect(joining(",", "[", "]"));
    }
}
class Solutions {

    private final int[] initNums;
    private final Random random = new Random();

    public Solutions(int[] nums) {
        initNums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return initNums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] result = Arrays.copyOf(initNums, initNums.length);
        for (int i = 1, j = random.nextInt(i+1);
             i < result.length;
             i++, j = random.nextInt(i+1)) {
            if (i == j) continue;
            result[i] = result[i] + result[j];
            result[j] = result[i] - result[j];
            result[i] = result[i] - result[j];
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

class MinStack {

    private final Deque<Integer> stack = new LinkedList<>();
    private final Deque<Integer> minStack = new LinkedList<>();

    /** initialize your data structure here. */
    public MinStack() {
        minStack.push(Integer.MIN_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(val, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */