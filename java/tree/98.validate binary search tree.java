class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        // Check current node
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Check left and right subtree
        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
}