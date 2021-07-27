package com.lib8.structure;

/**
 * Project: letscode
 *
 * 利用数组实现顺序栈
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
public class ArrayQueue implements Queue{
    private int[] data;
    private final int size;
    private int head = 0;  // 指向空
    private int tail = 0;  // 存有值

    public ArrayQueue(int size) {
        this.size = size;
        data = new int[size];
    }

    @Override
    public void offer(int i) {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        data[head++] = i;
        head %= size;
    }

    @Override
    public int get() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        int result = data[tail++];
        tail %= size;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return ((head + 1) % size) == tail;
    }
}
