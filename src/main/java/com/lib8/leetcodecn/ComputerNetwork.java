package com.lib8.leetcodecn;


import java.util.*;
import java.util.function.BiFunction;

/**
 * <a herf="https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/">联通网络的操作次数</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/20
 */
public class ComputerNetwork {
    /**
     * 修改链接，是计算中组成一个网络
     *
     * @param n 网络中计算机的数量
     * @param connections 链接明细
     * @return 需要修改几条链接
     */
    public int makeConnected(int n, int[][] connections) {
        if (n - 1 > connections.length) {
            return -1;
        }

        boolean[] pathed = new boolean[n];
        List<Integer>[] connectNode = new List[n];
        for (int i = 0; i < n; i++) {
            connectNode[i] = new ArrayList<Integer>();
        }
        for (int[] connection : connections) {
            connectNode[connection[0]].add(connection[1]);
            connectNode[connection[1]].add(connection[0]);
        }

        int connection = 0;
        for (int i = 0; i < n; i++) {
            if (!pathed[i]) {
                bfs(pathed, connectNode, i);
                connection +=1;
            }
        }

        return connection -1;
    }

    /**
     * 采用广度优先算法，进行链接遍历，可以判断是否所有节点可达
     */
    public void bfs(boolean[] pathed, List<Integer>[] connections, int node) {
        pathed[node] = true;
        for (Integer integer : connections[node]) {
            if (!pathed[integer]) {
                bfs(pathed, connections, integer);
            }
        }
    }

    public int makeConnected2(int n, int[][] connections) {
        if (n - 1 > connections.length) {
            return -1;
        }
        // 小值作为parent
        Set<Integer> parents = new HashSet<>();
        for (int[] connection : connections) {
            parents.add(Math.min(connection[0], connection[1]));
        }

        return (n - parents.size())/2;
    }
}



class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        UnionFind uf = new UnionFind(n);
        for (int[] conn : connections) {
            uf.unite(conn[0], conn[1]);
        }

        return uf.setCount - 1;
    }
}

// 并查集模板
class UnionFind {
    int[] parent;
    int[] size;
    int n;
    // 当前连通分量数目
    int setCount;

    public UnionFind(int n) {
        this.n = n;
        this.setCount = n;
        this.parent = new int[n];
        this.size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
    }

    public int findset(int x) {
        return parent[x] == x ? x : (parent[x] = findset(parent[x]));
    }

    public boolean unite(int x, int y) {
        x = findset(x);
        y = findset(y);
        if (x == y) {
            return false;
        }
        if (size[x] < size[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        parent[y] = x;
        size[x] += size[y];
        --setCount;
        return true;
    }

    public boolean connected(int x, int y) {
        x = findset(x);
        y = findset(y);
        return x == y;
    }
}
