package com.lib8.structure;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.fail;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
class ArrayStackTest {

    static ArrayStack stack;

    @BeforeAll
    public static void init() {
        stack = new ArrayStack(3);
    }

    @Test
    void push() {
        stack.push(0);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        stack.push(0);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);

    }

    @Test
    void pop() {
    }
}