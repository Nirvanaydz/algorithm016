package com.ydz;

import java.util.ArrayList;
import java.util.List;

public class _429_levelOrder {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resList = new ArrayList<>();
        recursion(root, 0, resList);
        return resList;
    }

    private void recursion(Node root, int depth, List<List<Integer>> res) {
        if (root == null) return;
        //判断是否是新的一层
        if (depth + 1 > res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);

        //处理子节点
        for (Node node : root.children) {
            if (node != null) {
                recursion(node, depth + 1, res);
            }
        }
    }

    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
