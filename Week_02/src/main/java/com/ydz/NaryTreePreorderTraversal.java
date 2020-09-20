package com.ydz;

import java.util.ArrayList;
import java.util.List;

// TODO: 2020/9/20 堆栈迭代的方法还未完全理解，自己手写还是不熟练，需要直接背诵
public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        recursion(res, root);
        return res;
    }
    private void recursion(List<Integer> tmp, Node tmpNode) {
        if (tmpNode == null) {
            return ;
        }
        tmp.add(tmpNode.val);
        for (Node child : tmpNode.children) {
            recursion(tmp, child);
        }
    }
}
class Node {
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
