package com.lib8.structure;

/**
 * Project: letscode
 *
 * 利用数组实现顺序栈
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
public class ArrayStack implements Stack{
    private int[] data;
    private final int size;
    private int head = 0;

    public ArrayStack(int size) {
        this.size = size;
        data = new int[size];
    }

    @Override
    public void push(int i) {
        if (isFull()) {
            throw new IllegalArgumentException();
        }
        data[head++] = i;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        return data[head--];
    }

    @Override
    public boolean isEmpty() {
        return head == 0;
    }

    @Override
    public boolean isFull() {
        return head == size;
    }
}
