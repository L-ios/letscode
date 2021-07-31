package com.lib8.leetcodecn;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/1
 */
class GetRowTest {

    @Test
    void getRow() {
        List<Integer> row = new GetRow().getRow(1);
        System.out.println(row.stream().map(String::valueOf).collect(joining(",")));
    }
}