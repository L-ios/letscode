package com.lib8.structure;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
public class ListStack implements Stack{

    private Node head;
    public ListStack() {
        head = null;
    }

    @Override
    public void push(int i) {
        Node node = new Node(i);
        node.next = head;
        head = node;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        Node node = head;
        head = head.next;
        return node.val;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
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
