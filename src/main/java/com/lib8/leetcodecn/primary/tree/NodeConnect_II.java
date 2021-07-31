package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/28
 */
public class NodeConnect_II {
    public Node connect(Node root) {
        int cNodes = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty() && queue.poll() != null) {
            Node node = queue.peek();

            for (int i = 0; i < cNodes; i++) {
                node = queue.poll();
                node.next = queue.peek();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            node.next = null;
            cNodes = queue.size();
        }

        return root;
    }
}
