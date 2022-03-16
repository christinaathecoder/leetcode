public class MinDepthOfBinaryTree {

    /**
     * RECURSIVE function to calculate the minimum depth of a tree
     * @param root tree to traverse
     * @return minimum depth of tree
     */
    public static int minDepth(TreeNode root) {
        //base case
        if (root == null) {
            return 0;
        }

        if ((root.left == null) && (root.right == null)) {
            return 1;
        }

        int ans = Integer.MAX_VALUE;

        if (root.left != null) {
            ans = Math.min(minDepth(root.left), ans);
        }
        if (root.right != null) {
            ans = Math.min(minDepth(root.right), ans);
        }

        return  ans + 1;
    }
}
