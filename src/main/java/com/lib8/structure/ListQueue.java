package com.lib8.structure;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
public class ListQueue implements Queue{

    private Node tail;
    private Node header;
    public ListQueue() {
        tail = null;
        header = tail;
    }

    @Override
    public void offer(int i) {
        Node node = new Node(i);
        node.next = tail;
        tail = node;
        if (header == null) {
            header = node;
        }
    }

    @Override
    public int get() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        int result = header.val;
        Node node = header;
        node.next = null;
        header = header.next;
        if (header == null) { // 其实这里可以
            tail = null;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return tail == header && header == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
}
