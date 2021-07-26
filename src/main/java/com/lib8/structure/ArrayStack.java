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
    private int front = 0;  // 指向空
    private int back = 0;  // 存有值

    public ArrayStack(int size) {
        this.size = size;
        data = new int[size];
    }

    @Override
    public void push(int i) {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        data[front++] = i;
        front %= size;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        int result = data[back++];
        back %= size;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return front == back;
    }

    @Override
    public boolean isFull() {
        return ((front + 1) % size) == back;
    }
}
