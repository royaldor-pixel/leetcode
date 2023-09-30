package binarytree;

import utils.TreeNode;

public class BalancedBinaryTree110 {
    
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
    
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = getHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }
        int res;
        if (Math.abs(leftHeight - rightHeight) > 1) {
            res = -1;
        } else {
            res = 1 + Math.max(leftHeight, rightHeight);
        }
        return res;
    }
    
}
