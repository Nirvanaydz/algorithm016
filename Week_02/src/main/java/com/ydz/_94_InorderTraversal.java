package com.ydz;

import java.util.ArrayList;
import java.util.List;

public class _94_InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        inorder_recursion(resList, root);
        return resList;
    }
    //  recursion
    private void inorder_recursion(List<Integer> tmpList, TreeNode tmpNode) {
        if (tmpNode == null) {
            return;
        }
        inorder_recursion(tmpList, tmpNode.left);
        tmpList.add(tmpNode.val);
        inorder_recursion(tmpList,tmpNode.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


