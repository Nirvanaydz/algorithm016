package com.ydz;

import java.util.ArrayList;
import java.util.List;

public class _144_PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        preorder_recursion(resList, root);
        return resList;
    }
    //  compare with 94，144，145
    private void preorder_recursion(List<Integer> tmpList, TreeNode tmpNode) {
        if (tmpNode == null) {
            return;
        }
        tmpList.add(tmpNode.val);// diff
        preorder_recursion(tmpList, tmpNode.left);
        preorder_recursion(tmpList, tmpNode.right);
    }

    private class TreeNode {
        int val;
        _144_PreorderTraversal.TreeNode left;
        _144_PreorderTraversal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, _144_PreorderTraversal.TreeNode left, _144_PreorderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
