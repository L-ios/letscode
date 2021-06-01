package com.lib8.leetcodecn.base;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/20
 */
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> collect = Stream.of(words).collect(toMap(Function.identity(), s -> 1, (v1, v2) -> v1 + v2));
        return collect.entrySet().stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() > e2.getValue()) {
                        return -1;
                    } else if (e1.getValue() == e2.getValue()) {
                        if (e1.getKey().compareTo(e2.getKey()) > 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    } else {
                        return 1;
                    }
                }).map(Map.Entry::getKey).limit(k).collect(Collectors.toList());
    }

    private final int[] initNums = new int[2];
    private final Random random = new Random();
    public int[] s() {
        int[] result = Arrays.copyOf(initNums, initNums.length);
        int i = random.nextInt(initNums.length);
        int temp = result[i];
        result[i] = result[0];
        result[0] = temp;
        return result;
    }
}
