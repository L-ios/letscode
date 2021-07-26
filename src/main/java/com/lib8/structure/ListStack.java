package com.lib8.structure;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
public class ListStack implements Stack{

    private Node head;
    private Node tail;
    public ListStack() {
        head = null;
        tail = head;
    }

    @Override
    public void push(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }

    @Override
    public int pop() {
        if (isEmpty() || tail == null) {
            throw new IllegalArgumentException();
        }
        int result = tail.val;
        Node node = tail;
        node.next = null;
        tail = tail.next;
        if (isEmpty()) { // 其实这里可以
            head = null;
            tail = null;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
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
