class Solution {

    int i = 0;

    public TreeNode buildTree(int[] pre, int[] in) {
        return build(pre, in, 0, in.length - 1);
    }

    TreeNode build(int[] pre, int[] in, int s, int e) {

        if (s > e) return null;

        TreeNode root = new TreeNode(pre[i++]);

        int pos = s;
        while (in[pos] != root.val) pos++;

        root.left = build(pre, in, s, pos - 1);
        root.right = build(pre, in, pos + 1, e);

        return root;
    }
}