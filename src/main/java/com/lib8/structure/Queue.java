package com.lib8.structure;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/26
 */
public interface Queue {

    public void offer(int i);

    public int get();

    public boolean isEmpty();

    public boolean isFull();

}
